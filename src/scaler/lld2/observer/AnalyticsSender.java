package scaler.lld2.observer;

public class AnalyticsSender implements OrderPlacedSubscriber, OrderCancelledSubscriber {

    public AnalyticsSender() {
        Amazon.getInstance().registerOnOrderPlace(this);
        Amazon.getInstance().registerOnOrderCancellation(this);
    }

    @Override
    public void onOrderCancelled() {
        System.out.println("Sending analytics as order has been cancelled!");
    }

    @Override
    public ReturnData onOrderPlaced() {
        System.out.println("Sending analytics as order has been placed!");
        return new ReturnData("success! Order Placed!");
    }
}
