package defaultPackage;

public class InterfaceClient implements InterfaceA,InterfaceB,InterfaceC {

    /* Execution order --> if method overriden in implementation class it will be pick at runtime
    then if it is not in implementation class but is sub interface then it will be executed at runtime
    last if it is not present in both implementation class and sub interface then last interface will be prefered
     */
    public static void main(String[] args) {
        InterfaceClient interfaceClient = new InterfaceClient();
        interfaceClient.a();
        interfaceClient.b();
        interfaceClient.c();
    }

    public void a() {
        System.out.println("In method a " + InterfaceClient.class);
    }
}
