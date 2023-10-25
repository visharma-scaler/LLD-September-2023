package scaler.lld2.factory;

public class Flutter {
    public void setTheme() {
        System.out.println("Setting theme ...");
    }

    public void setRefreshRate(int hertz) {
        System.out.println("Setting refresh rate to " + hertz + " hertz");
    }

    public UIFactory createFactory(SupportedPlatform supportedPlatform) {
        return UIFactoryFactory.createFactoryBasedOnPlatform(supportedPlatform);
    }
}
