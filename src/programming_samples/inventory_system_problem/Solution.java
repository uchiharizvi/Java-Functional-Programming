package programming_samples.inventory_system_problem;

import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Solution {
    public static void main(String[] args) {
        //Supplier to generate Random Products
        Supplier<Product> productSupplier = () -> {
            String[] products = {"Laptop", "Smartphone", "Headphones", "Monitor", "Keyboard"};
            Random rand = new Random();
            String name = products[rand.nextInt(products.length)];
            double price = rand.nextInt(15000) + 5000; //Random price between 50 and 500
            boolean available = rand.nextBoolean(); //random availability
            return new Product(name, price, available);
        };

        Consumer<Product> productConsumer = product -> System.out.println("Consuming Product: " + product);

        //test
        for(int i=0;i<5;i++) {
            Product product = productSupplier.get();
            productConsumer.accept(product);
        }
    }

}
