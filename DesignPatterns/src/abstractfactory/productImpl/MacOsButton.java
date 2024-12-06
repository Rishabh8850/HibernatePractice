package abstractfactory.productImpl;

import abstractfactory.product.Button;

public class MacOsButton implements Button {
    @Override
    public void paint() {
        System.out.println("MacOs Button");
    }
}
