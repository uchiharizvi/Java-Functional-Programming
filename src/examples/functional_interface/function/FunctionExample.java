package examples.functional_interface.function;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.IntStream;

public class FunctionExample {
    public static void main(String[] args) {
        List<Integer> numbers = IntStream.rangeClosed(1, 100).boxed().toList();//boxed usage? rangeCloses Usage?
        Predicate<Integer> isEven = number -> number % 2 == 0;
        Predicate<Integer> isOdd = number -> number % 2 != 0;
        Consumer<List<Integer>> printNumbers = filterNumbers ->
                filterNumbers.forEach(number -> System.out.println("Number : " + number));
        Function<Predicate<Integer>, List<Integer>> filterNumbers = predicate ->
                numbers.stream().filter(predicate).toList();

        System.out.println("Even Numbers:");
        /** filteredNumbers a Function takes IsEven a Predicate as a param and returns a List<Integer>
         * Usage : ReturnType = <FunctionName>.apply(<ParamName>) **/
        List<Integer> evenNumbers = filterNumbers.apply(isEven);
        /** printNumbers a Consumer return void and takes a List<Integer> as param**/
        printNumbers.accept(evenNumbers);
        System.out.println("Odd Numbers:");
        List<Integer> oddNumbers = filterNumbers.apply(isOdd);
        printNumbers.accept(oddNumbers);

    }

}
