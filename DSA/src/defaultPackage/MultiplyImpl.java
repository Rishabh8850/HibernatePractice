package defaultPackage;

import java.util.List;

public class MultiplyImpl implements Multiply{
    @Override
    public int getResult(List<Integer> intList) {
        return intList.stream().reduce(1, (x,y) -> x*y);
    }

    public int getSize(List<Integer> integerList) {
        System.out.println("Inside Multiply Class :");
        return integerList.size();
    }
}
