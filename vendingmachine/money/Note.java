package vendingmachine.money;

public class Note extends Money {
    public Note(double amount) {
        super(amount, Type.NOTE);
    }
}