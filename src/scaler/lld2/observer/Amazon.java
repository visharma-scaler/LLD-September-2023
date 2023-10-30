package scaler.lld2.observer;

import scaler.lld1.interfaces.A;

import java.util.ArrayList;
import java.util.List;

public class Amazon {

    private static Amazon instance;

    private List<OrderPlacedSubscriber> orderPlacedSubscribers;
    private List<OrderCancelledSubscriber> orderCancelledSubscribers;

    private Amazon() {
        orderCancelledSubscribers = new ArrayList<>();
        orderPlacedSubscribers = new ArrayList<>();
    }

    public static Amazon getInstance() {
        if (instance == null) {
            instance = new Amazon();
        }
        return instance;
    }

    void registerOnOrderPlace(OrderPlacedSubscriber orderPlacedSubscriber) {
        orderPlacedSubscribers.add(orderPlacedSubscriber);
    }

    void registerOnOrderCancellation(OrderCancelledSubscriber orderCancelledSubscriber) {
        orderCancelledSubscribers.add(orderCancelledSubscriber);
    }

    void deregisterOnOrderPlace(OrderPlacedSubscriber orderPlacedSubscriber) {
        orderPlacedSubscribers.remove(orderPlacedSubscriber);
    }

    void deregisterOnOrderCancellation(OrderCancelledSubscriber orderCancelledSubscriber) {
        orderCancelledSubscribers.remove(orderCancelledSubscriber);
    }

    public void orderPlaced() {
        // ims.update();
        // emails.send()
        // invoice.generate();

        orderPlacedSubscribers.
                stream()
                .map(OrderPlacedSubscriber::onOrderPlaced)
                .forEach(System.out::println);
    }

    public void orderCancelled() {
        orderCancelledSubscribers.forEach(OrderCancelledSubscriber::onOrderCancelled);
    }
}

