package vendingmachine;

import java.util.ArrayList;
import java.util.List;

import vendingmachine.money.Money;
import vendingmachine.money.Note;
import vendingmachine.product.Biscuit;
import vendingmachine.product.Category;
import vendingmachine.product.Chip;
import vendingmachine.product.Drink;
import vendingmachine.product.Product;

public class Demo {
    public static void main(String[] args) {
        VendingMachine vendingMachine = VendingMachine.getVendingMachine();
        System.out.println("Vending machine created");

        Product drink1 = new Drink(1, "drink1", 40);
        Product drink2 = new Drink(3, "drink2", 50);
        Product biscuit1 = new Biscuit(2, "biscuit1", 50);
        Product chip1 = new Chip(3, "chip1", 20);

        vendingMachine.addProduct(drink1);
        vendingMachine.addProduct(drink2);
        vendingMachine.addProduct(biscuit1);
        vendingMachine.addProduct(chip1);

        System.out.println("Products added");

        try {
            Money money100 = new Note(100);
            List<Money> moneyList = new ArrayList<>();
            moneyList.add(money100);
            vendingMachine.buyProducts(Category.DRINK, 2, moneyList);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
