package defaultPackage;

public interface InterfaceA {

    default void a() {
        System.out.println("In Interface A "+InterfaceA.class);
    }
}
