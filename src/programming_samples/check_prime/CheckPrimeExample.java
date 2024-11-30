package programming_samples.check_prime;

import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.IntStream;

/**
 * WAP to check if a given number is a prime number
 * A prime number is a natural number > 1 that has no divisors other than 1 and itself
 * logic number -> number%1 == 0 && number%number ==0
 */
public class CheckPrimeExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);// for user input
        List<Integer> numbers = IntStream.rangeClosed(1, 50).boxed().toList();
        Function<Predicate<Integer>, List<Integer>> filterPrimeNos = predicate ->
                numbers.stream()
                        .filter(predicate)
                        .toList();
        Predicate<Integer> isPrime = number -> number>1
                && IntStream
                .rangeClosed(2 , (int) Math.sqrt(number))
                .noneMatch(divisor -> number % divisor == 0);
        Consumer<List<Integer>> printNumbers = number -> System.out.println("Number : " + number);

        List<Integer> primeNumbers = filterPrimeNos.apply(isPrime);
        printNumbers.accept(primeNumbers);

    }
}
