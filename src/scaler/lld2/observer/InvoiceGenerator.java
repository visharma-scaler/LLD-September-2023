package scaler.lld2.observer;

public class InvoiceGenerator implements OrderPlacedSubscriber {

    public InvoiceGenerator() {
        Amazon.getInstance().registerOnOrderPlace(this);
    }
    @Override
    public ReturnData onOrderPlaced() {
        System.out.println("Generating invoice as order has been placed!");
        return new ReturnData("success! Order Placed!");

    }
}
