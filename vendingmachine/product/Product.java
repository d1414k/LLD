package vendingmachine.product;

public class Product {
    private int id;
    private String name;
    private double amount;
    private Category category;

    public Product(int id, String name, double amount, Category category) {
        this.id = id;
        this.name = name;
        this.amount = amount;
        this.category = category;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getAmount() {
        return amount;
    }

    public Category getCategory() {
        return category;
    }

    @Override
    public String toString() {
        return "Product [id=" + id + ", name=" + name + ", amount=" + amount + ", category=" + category + "]";
    }

}
