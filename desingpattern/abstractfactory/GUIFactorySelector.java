package desingpattern.abstractfactory;

public class GUIFactorySelector {
    public static GUIFactory getGUIFactory(String osType) {
        if (osType == "mac") {
            return new MacFactory();
        } else if (osType == "windows") {
            return new WindowsFactory();
        } else {
            System.out.println("unsupported os type: " + osType);
        }
        return null;
    }
}
