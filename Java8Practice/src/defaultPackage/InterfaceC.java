package defaultPackage;

public interface InterfaceC extends InterfaceB {

    default void c() {
        System.out.println("In Interface C " + InterfaceC.class);
    }

    default void b() {
        System.out.println("In method B "+ InterfaceC.class);
    }

    default void a() {
        System.out.println("In method a " + InterfaceC.class);
    }
}
