package vendingmachine;

import java.util.List;

import vendingmachine.money.Money;
import vendingmachine.product.Category;
import vendingmachine.product.Product;

public class VendingMachine {
    private static VendingMachine instance;
    private Inventory inventory;

    public VendingMachine() {
        inventory = new Inventory();
    }

    // single instance
    public static synchronized VendingMachine getVendingMachine() {
        if (instance == null) {
            instance = new VendingMachine();

        }
        return instance;
    }

    public synchronized void addProduct(Product product) {
        inventory.addProduct(product);
    }

    public synchronized void buyProducts(Category category, int quantity, List<Money> moneyList) throws Exception {
        // find total amount
        double amount = 0;
        for (Money money : moneyList) {
            amount = money.getAmount();
        }
        List<Product> boughtProducts = inventory.buyProduct(category, quantity, amount);

        // find amount to return
        double usedAmont = 0;
        for (Product product : boughtProducts) {
            usedAmont += product.getAmount();
        }

        System.out.println("Returned amount: " + (amount - usedAmont));

        System.out.println("Products bought: " + boughtProducts);
    }

    @Override
    public String toString() {
        return "VendingMachine [inventory=" + inventory + ", toString()=" + super.toString() + "]";
    }

}
