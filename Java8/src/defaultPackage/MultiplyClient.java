package defaultPackage;

import java.util.Arrays;
import java.util.List;

public class MultiplyClient {

    public static void main(String[] args) {
        Multiply multiply = new MultiplyImpl();
        List<Integer> intList = Arrays.asList(1,3,5,7,9);
        System.out.println("The result is : "+ multiply.getResult(intList));
        System.out.println("Size of the list : "+ multiply.getSize(intList));
        System.out.println("Empty check for list : "+ Multiply.isNotEmpty(intList));
    }
}
