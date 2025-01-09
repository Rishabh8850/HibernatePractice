package defaultPackage;

import java.util.List;

public interface Multiply {
    int getResult(List<Integer> intList);

    /* If we have not overriden the default method in implementation class then it has been called using object reference.
    If we have ovrriden default method in our implementation class then for sure that will be called
     */
    default int getSize(List<Integer> integerList) {
        System.out.println("Inside Multiply Interface :");
        return integerList.size();
    }

    /* We cannot override static method
    We can call static method using Interface Name
     */
    static boolean isNotEmpty(List<Integer> integerList) {
        return integerList != null && !integerList.isEmpty();
    }
}
