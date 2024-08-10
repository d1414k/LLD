package desingpattern.abstractfactory;

public class MacFactory implements GUIFactory {

    public Button createButton() {
        return new MacButton();
    }

    public Text createText() {
        return new MacText();
    }
}
