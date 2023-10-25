package scaler.lld2.factory.components.iosComponents;

import scaler.lld2.factory.components.Button;

public class IosButton implements Button {

    @Override
    public void changeSize() {
        System.out.println("Changing size in ios device");
    }
}
