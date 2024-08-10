package vendingmachine.money;

public class Money {
    private double amount;
    private Type type;

    public Money(double amount, Type type) {
        this.amount = amount;
        this.type = type;
    }

    public double getAmount() {
        return amount;
    }

    public Type getType() {
        return type;
    }

}
