package vendingmachine;

import java.io.EOFException;
import java.util.ArrayList;
import java.util.List;

import vendingmachine.product.Category;
import vendingmachine.product.Product;

public class Inventory {
    List<Product> products;

    public Inventory() {
        products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public List<Product> buyProduct(Category category, int quantity, double amount) throws Exception {
        // find total no of this product
        int totalQuantity = 0;
        for (Product product : products) {
            if (product.getCategory() == category) {
                totalQuantity++;
            }
        }
        if (totalQuantity < quantity)
            throw new Exception("reduce the quantity");

        List<Product> boughtProducts = new ArrayList<>();
        for (Product product : products) {
            if (product.getCategory() == category && quantity > 0) {
                boughtProducts.add(product);
                quantity--;
                amount -= product.getAmount();
                if (amount < 0) {
                    throw new Exception("insufficient amount");
                }
            }
        }

        // remove products
        products.removeAll(boughtProducts);
        return boughtProducts;
    }

    @Override
    public String toString() {
        return "Inventory [products=" + products + "]";
    }

}
