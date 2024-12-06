package abstractfactory.factoryImpl;

import abstractfactory.factory.GUIFactory;
import abstractfactory.product.Button;
import abstractfactory.product.Checkbox;
import abstractfactory.productImpl.WindowsButton;
import abstractfactory.productImpl.WindowsCheckbox;

public class Windows implements GUIFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox creaCheckbox() {
        return new WindowsCheckbox();
    }
}
