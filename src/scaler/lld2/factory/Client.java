package scaler.lld2.factory;

import scaler.lld2.factory.components.Button;

public class Client {
    public static void main(String[] args) {
        Flutter flutter = new Flutter();
        UIFactory factory = flutter.createFactory(SupportedPlatform.ANDROID);
        Button button = factory.createButton();
        button.changeSize();
    }
}
