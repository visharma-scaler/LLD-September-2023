package scaler.lld2.factory;

import scaler.lld2.factory.android.AndroidFactory;
import scaler.lld2.factory.ios.IosFactory;

public class UIFactoryFactory {

    public static UIFactory createFactoryBasedOnPlatform(SupportedPlatform supportedPlatform) {
        return switch (supportedPlatform) {
            case IOS -> new IosFactory();
            case ANDROID -> new AndroidFactory();
            default -> new AndroidFactory();
        };
    }
}
