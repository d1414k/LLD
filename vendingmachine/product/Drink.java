package vendingmachine.product;

public class Drink extends Product {
    public Drink(int id, String name, double amount) {
        super(id, name, amount, Category.DRINK);
    }
}
