package scaler.lld3.parkinglot.models;

import java.util.Date;
import java.util.List;

public class Bill extends BaseModel{
    private Date exitTime;
    private int amount;
    private Ticket ticket;
    private Gate exitGate;
    private Operator generatedBy;
    private BillStatus billStatus;
    private List<Payment> payments;
    private List<FeesCalculatorStrategyType> feesCalculatorStrategyTypes;

    public Date getExitTime() {
        return exitTime;
    }

    public void setExitTime(Date exitTime) {
        this.exitTime = exitTime;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public Gate getExitGate() {
        return exitGate;
    }

    public void setExitGate(Gate exitGate) {
        this.exitGate = exitGate;
    }

    public Operator getGeneratedBy() {
        return generatedBy;
    }

    public void setGeneratedBy(Operator generatedBy) {
        this.generatedBy = generatedBy;
    }

    public BillStatus getBillStatus() {
        return billStatus;
    }

    public void setBillStatus(BillStatus billStatus) {
        this.billStatus = billStatus;
    }

    public List<Payment> getPayments() {
        return payments;
    }

    public void setPayments(List<Payment> payments) {
        this.payments = payments;
    }

    public List<FeesCalculatorStrategyType> getFeesCalculatorStrategyTypes() {
        return feesCalculatorStrategyTypes;
    }

    public void setFeesCalculatorStrategyTypes(List<FeesCalculatorStrategyType> feesCalculatorStrategyTypes) {
        this.feesCalculatorStrategyTypes = feesCalculatorStrategyTypes;
    }
}
