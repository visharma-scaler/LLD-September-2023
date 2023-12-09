package scaler.lld3.parkinglot.services;

import scaler.lld3.parkinglot.exceptions.GateNotFoundException;
import scaler.lld3.parkinglot.exceptions.ParkingLotNotFoundException;
import scaler.lld3.parkinglot.models.*;
import scaler.lld3.parkinglot.repositories.GateRepository;
import scaler.lld3.parkinglot.repositories.ParkingLotRepository;
import scaler.lld3.parkinglot.repositories.TicketRepository;
import scaler.lld3.parkinglot.repositories.VehicleRepository;
import scaler.lld3.parkinglot.strategy.spotAssignmentStrategy.SpotAssignmentFactory;
import scaler.lld3.parkinglot.strategy.spotAssignmentStrategy.SpotAssignmentStrategy;

import java.util.Date;
import java.util.Optional;

public class TicketService {

    private final GateRepository gateRepository;
    private final TicketRepository ticketRepository;
    private final VehicleRepository vehicleRepository;
    private final ParkingLotRepository parkingLotRepository;

    public TicketService(GateRepository gateRepository,
                         TicketRepository ticketRepository,
                         VehicleRepository vehicleRepository,
                         ParkingLotRepository parkingLotRepository) {
        this.gateRepository = gateRepository;
        this.ticketRepository = ticketRepository;
        this.vehicleRepository = vehicleRepository;
        this.parkingLotRepository = parkingLotRepository;
    }

    public Ticket issueTicket(String vehicleNumber,
                              VehicleType vehicleType,
                              String vehicleOwnerName,
                              Long gateId) {
        // 1. Create a Ticket object
        // 2. Assign a spot
        // 3. Return the updated ticket

        Ticket ticket = new Ticket();
        ticket.setEntryTime(new Date());

        Optional<Gate> gate = gateRepository.findById(gateId);

        if (gate.isEmpty()) {
            throw new GateNotFoundException();
        }


        Gate generatedAt = gate.get();

        Optional<ParkingLot> parkingLotOptional = parkingLotRepository.findByGate(generatedAt);
        if (parkingLotOptional.isEmpty()) {
            throw new ParkingLotNotFoundException();
        }

        ParkingLot parkingLot = parkingLotOptional.get();

        SpotAssignmentStrategy spotAssignmentStrategy = SpotAssignmentFactory.getSpotAssignmentStrategyByType(parkingLot.getSpotAssignmentStrategyType());
        ParkingSpot spot = spotAssignmentStrategy.getSpot(generatedAt, vehicleType);

        ticket.setAssignedSpot(spot);
        ticket.setGeneratedAt(generatedAt);
        ticket.setGeneratedBy(generatedAt.getCurrentOperator());

        Optional<Vehicle> vehicleOptional = vehicleRepository.findByNumber(vehicleNumber);
        Vehicle savedVehicle;


        if (vehicleOptional.isEmpty()) {
            Vehicle vehicle = new Vehicle();
            vehicle.setNumber(vehicleNumber);
            vehicle.setVehicleType(vehicleType);
            vehicle.setOwnerName(vehicleOwnerName);

            savedVehicle = vehicleRepository.save(vehicle);
        } else {
            savedVehicle = vehicleOptional.get();
        }

        ticket.setVehicle(savedVehicle);

        Ticket savedTicket = ticketRepository.save(ticket);

        ticket.setNumber("Ticket - " + savedTicket.getId());
        return ticket;

        // Break till 10:01 PM IST
    }
}
