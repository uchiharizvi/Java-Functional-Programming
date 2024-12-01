package programming_samples.inventory_system_problem;

import utility.CurrencyUtils;

import java.util.function.Supplier;

public class Product {
    private String name;
    private double price;
    private boolean available;

    public Product(String name, double price, boolean available) {
        this.name = name;
        this.price = price;
        this.available = available;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public boolean isAvailable() {
        return available;
    }

    @Override
    public String toString() {
        return "Product: " + name + ", Price: "+ CurrencyUtils.indianCurrency() +  price + ", Available: " + (available ? "Yes" : "No");
    }
}
