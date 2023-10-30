package scaler.lld2.observer;

public class EmailSender implements OrderPlacedSubscriber {

    public EmailSender() {
        Amazon.getInstance().registerOnOrderPlace(this);
    }

    @Override
    public ReturnData onOrderPlaced() {
        System.out.println("Sending emails as order has been placed!");
        return new ReturnData("success! Order Placed!");
    }
}
