package streams.filter;

import java.util.List;
import java.util.stream.IntStream;

public class FilterExample {
    public static void main(String[] args) {
        List<Integer> numbers = IntStream.rangeClosed(1,100).boxed().toList();
        filterEvenNumbers(numbers);
        filterOddNumbers(numbers);
    }

    public static void filterEvenNumbers (List<Integer> numbers) {
        numbers.stream()
                .filter(num -> num %2 ==0)
                .forEach(System.out::println);
    }

    public static void filterOddNumbers (List<Integer> numbers) {
        numbers.stream()
                .filter(num -> num %2 !=0)
                .forEach(System.out::println);
    }

}
