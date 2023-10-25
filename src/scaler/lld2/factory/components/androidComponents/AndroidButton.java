package scaler.lld2.factory.components.androidComponents;

import scaler.lld2.factory.components.Button;

public class AndroidButton implements Button {

    @Override
    public void changeSize() {
        System.out.println("Changing size in android device");
    }
}
