package scaler.lld2.factory.android;

import scaler.lld2.factory.UIFactory;
import scaler.lld2.factory.components.androidComponents.AndroidButton;
import scaler.lld2.factory.components.androidComponents.AndroidDropdown;
import scaler.lld2.factory.components.androidComponents.AndroidMenu;

public class AndroidFactory implements UIFactory {

    @Override
    public AndroidButton createButton() {
        return new AndroidButton();
    }

    @Override
    public AndroidMenu createMenu() {
        return new AndroidMenu();
    }

    @Override
    public AndroidDropdown createDropdown() {
        return new AndroidDropdown();
    }
}
