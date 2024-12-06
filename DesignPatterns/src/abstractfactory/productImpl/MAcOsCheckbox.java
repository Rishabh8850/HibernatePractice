package abstractfactory.productImpl;

import abstractfactory.product.Checkbox;

public class MAcOsCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("MacOs Checkbox");
    }
}
