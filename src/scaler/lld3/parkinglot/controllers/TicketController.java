package scaler.lld3.parkinglot.controllers;

import scaler.lld3.parkinglot.dtos.IssueTicketRequestDto;
import scaler.lld3.parkinglot.dtos.IssueTicketResponseDto;
import scaler.lld3.parkinglot.dtos.ResponseStatus;
import scaler.lld3.parkinglot.models.Ticket;
import scaler.lld3.parkinglot.services.TicketService;

public class TicketController {

    private final TicketService ticketService;

    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    public IssueTicketResponseDto issueTicket(IssueTicketRequestDto request) {
        // 1. Validates the request
        // 2. It calls the relevant services
        // 3. It receives input from those
        // 4. It creates output for client

        IssueTicketResponseDto response = new IssueTicketResponseDto();
        try {

            Ticket ticket = ticketService.issueTicket(
                    request.getNumber(),
                    request.getVehicleType(),
                    request.getOwnerName(),
                    request.getGateId()
            );

            response.setStatus(ResponseStatus.SUCCESS);
            response.setTicket(ticket);
        } catch (Exception e) {
            response.setStatus(ResponseStatus.FAILURE);
            response.setFailureReason("Error - " + e.getMessage());
        }

        return response;
    }
}
