package scaler.lld3.parkinglot;

import scaler.lld3.parkinglot.controllers.TicketController;
import scaler.lld3.parkinglot.repositories.GateRepository;
import scaler.lld3.parkinglot.repositories.ParkingLotRepository;
import scaler.lld3.parkinglot.repositories.TicketRepository;
import scaler.lld3.parkinglot.repositories.VehicleRepository;
import scaler.lld3.parkinglot.services.TicketService;
import scaler.lld3.parkinglot.strategy.spotAssignmentStrategy.SpotAssignmentFactory;

public class ParkingLotApplication {
    public static void main(String[] args) {
        // TicketController -> TicketService -> TicketRepository, ParkingLotRepository, GateRepository, VehicleRepository

        TicketRepository ticketRepository = new TicketRepository();
        ParkingLotRepository parkingLotRepository = new ParkingLotRepository();
        VehicleRepository vehicleRepository = new VehicleRepository();
        GateRepository gateRepository = new GateRepository();
        SpotAssignmentFactory spotAssignmentFactory = new SpotAssignmentFactory(parkingLotRepository);


        TicketService ticketService = new TicketService(
                gateRepository,
                ticketRepository,
                vehicleRepository,
                parkingLotRepository,
                spotAssignmentFactory);

        TicketController ticketController = new TicketController(ticketService);

        System.out.println("Server has been started at port - 8080");

    }
}
