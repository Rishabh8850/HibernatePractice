package defaultPackage;

public interface InterfaceB extends InterfaceA{

    default void b() {
        System.out.println("In interface B "+ InterfaceB.class);
    }

    default void a() {
        System.out.println("In method a " + InterfaceB.class);
    }
}
