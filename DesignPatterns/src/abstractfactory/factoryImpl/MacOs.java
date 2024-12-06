package abstractfactory.factoryImpl;

import abstractfactory.factory.GUIFactory;
import abstractfactory.product.Button;
import abstractfactory.product.Checkbox;
import abstractfactory.productImpl.MAcOsCheckbox;
import abstractfactory.productImpl.MacOsButton;

public class MacOs implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacOsButton();
    }

    @Override
    public Checkbox creaCheckbox() {
        return new MAcOsCheckbox();
    }
}
