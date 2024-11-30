package functional_interface.consumer;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class ConsumerExample001 {
    public static void main(String[] args) {
        List<String> fruits = List.of("Apple", "Mango", "Banana", "Grape", "Carrot");
        //Predicate to Filter out only Fruits
        Predicate<String> fakeFruit = item -> !"Carrot".equalsIgnoreCase(item);
        //Consumer to Print Fruit
        Consumer<String> printFruit = fruit -> System.out.println("Filtered Fruit : " + fruit);

        filterFruits(fruits, fakeFruit, printFruit);

    }

    private static void filterFruits(List<String> fruits, Predicate<String> fakeFruit, Consumer<String> printFruit) {
        fruits.stream().filter(fakeFruit).forEach(printFruit);
    }

}
