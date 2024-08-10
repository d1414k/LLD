package desingpattern.abstractfactory;

public class Main {
    public static void main(String[] args) {
        String osType = "windows";
        // String osType = "mac";

        GUIFactory guiFactory = GUIFactorySelector.getGUIFactory(osType);
        Button button = guiFactory.createButton();
        button.click();

        Text text = guiFactory.createText();
        text.display();
    }
}
