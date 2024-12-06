import abstractfactory.client.Application;
import abstractfactory.factory.GUIFactory;
import abstractfactory.factoryImpl.MacOs;
import abstractfactory.factoryImpl.Windows;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        Application app = configureApplication();
        // Press Shift+F10 or click the green arrow button in the gutter to run the code.
        app.paint();
    }

    private static Application configureApplication() {
        Application app;
        GUIFactory factory;
        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("mac")) {
            factory = new MacOs();
        } else {
            factory = new Windows();
        }
        app = new Application(factory);
        return app;
    }
}