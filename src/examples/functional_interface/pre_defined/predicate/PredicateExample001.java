package examples.functional_interface.pre_defined.predicate;

import java.util.List;
import java.util.function.Predicate;

public class PredicateExample001 {
    public static void main(String[] args) {
        List<String> fruits = List.of("Apple", "Mango", "Banana", "Grape", "Carrot");
        System.out.println("List of Fruits");
        System.out.println("-----------------");
        fruits.forEach(System.out::println);
        Predicate<String> fakeFruit = item -> !"Carrot".equalsIgnoreCase(item);
        System.out.println("List of Filtered Fruits");
        System.out.println("------------------------");
        filterFruits(fruits, fakeFruit);

    }

    private static void filterFruits(List<String> fruits, Predicate<String> fakeFruit) {
        fruits.stream().filter(fakeFruit).forEach(System.out::println);
    }

}
