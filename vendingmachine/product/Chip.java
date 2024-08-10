package vendingmachine.product;

public class Chip extends Product {
    public Chip(int id, String name, double amount) {
        super(id, name, amount, Category.CHIP);
    }
}
