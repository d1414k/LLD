package vendingmachine.product;

public class Biscuit extends Product {
    public Biscuit(int id, String name, double amount) {
        super(id, name, amount, Category.BISCUIT);
    }
}
