package examples.streams.map;

import java.util.List;
import java.util.stream.IntStream;

public class MapExample {
    public static void main(String[] args) {
        square(IntStream.rangeClosed(1,50).boxed().toList());
    }

    private static void square(List<Integer> numbers) {
        numbers.stream()
                .map(number->number * number)
                .forEach(System.out::println);
    }
}
