package scaler.lld2.factory;

import scaler.lld2.factory.components.Button;
import scaler.lld2.factory.components.Dropdown;
import scaler.lld2.factory.components.Menu;

public interface UIFactory {
    Button createButton();
    Menu createMenu();
    Dropdown createDropdown();
}
