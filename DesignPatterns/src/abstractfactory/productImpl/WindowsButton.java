package abstractfactory.productImpl;

import abstractfactory.product.Button;

public class WindowsButton implements Button {
    @Override
    public void paint() {
        System.out.println("Windows button");
    }
}
