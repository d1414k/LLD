package desingpattern.abstractfactory;

public class WindowsFactory implements GUIFactory {

    public Button createButton() {
        return new WindowsButton();
    }

    public Text createText() {
        return new WindowsText();
    }
}
