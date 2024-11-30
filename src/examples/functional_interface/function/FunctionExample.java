package examples.functional_interface.function;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.IntStream;

public class FunctionExample {
    public static void main(String[] args) {
        List<Integer> numbers = IntStream.rangeClosed(1, 100).boxed().toList();//boxed usage? rangeCloses Usage?
        Predicate<Integer> isEven = number -> number % 2 == 0;
        Predicate<Integer> isOdd = number -> number % 2 != 0;
        Consumer<Integer> printEven = number -> System.out.println("Even Number : " + number);
        Consumer<Integer> printOdd = number -> System.out.println("Even Number : " + number);

    }
}
