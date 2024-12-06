package abstractfactory.client;

import abstractfactory.factory.GUIFactory;
import abstractfactory.product.Button;
import abstractfactory.product.Checkbox;

public class Application {
    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory guiFactory) {
        button = guiFactory.createButton();
        checkbox = guiFactory.creaCheckbox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }
}
