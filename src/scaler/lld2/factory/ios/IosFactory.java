package scaler.lld2.factory.ios;

import scaler.lld2.factory.UIFactory;
import scaler.lld2.factory.components.iosComponents.IosButton;
import scaler.lld2.factory.components.iosComponents.IosDropdown;
import scaler.lld2.factory.components.iosComponents.IosMenu;

public class IosFactory implements UIFactory {

    @Override
    public IosButton createButton() {
        return new IosButton();
    }

    @Override
    public IosMenu createMenu() {
        return new IosMenu();
    }

    @Override
    public IosDropdown createDropdown() {
        return new IosDropdown();
    }
}
