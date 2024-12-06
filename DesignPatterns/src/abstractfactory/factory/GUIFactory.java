package abstractfactory.factory;

import abstractfactory.product.Button;
import abstractfactory.product.Checkbox;

public interface GUIFactory {
    Button createButton();
    Checkbox creaCheckbox();
}
