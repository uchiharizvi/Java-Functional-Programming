package examples.functional_interface.supplier;

import java.util.function.Supplier;

public class SupplierExample001 {
    public static void main(String[] args) {
        Supplier<String> randomGreeting = () -> {
            String[] greetings = {"Hello", "Hi", "Hey", "Greetings", "Welcome"};
            int randomIndex = (int) (Math.random() * greetings.length);
            return greetings[randomIndex] + " there!";
        };

        System.out.println(randomGreeting.get());
        System.out.println(randomGreeting.get());
    }
}
