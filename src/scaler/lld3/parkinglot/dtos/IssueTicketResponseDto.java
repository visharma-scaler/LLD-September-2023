package scaler.lld3.parkinglot.dtos;

import scaler.lld3.parkinglot.models.Ticket;

public class IssueTicketResponseDto {
    private ResponseStatus status;
    private Ticket ticket;
    private String failureReason;

    public String getFailureReason() {
        return failureReason;
    }

    public void setFailureReason(String failureReason) {
        this.failureReason = failureReason;
    }

    public ResponseStatus getStatus() {
        return status;
    }

    public void setStatus(ResponseStatus status) {
        this.status = status;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }
}
