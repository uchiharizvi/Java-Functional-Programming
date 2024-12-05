package examples.functional_interface.pre_defined.predicate;

import java.util.function.Predicate;

/**
 * Showcase use of test(), and(), or(), negate(), isEqual() and not()
 */
public class PredicateExample002 {
    public static void main(String[] args) {
        //Implementation defined
        Predicate<Integer> isEven = number -> number % 2 == 0;
        Predicate<Integer> isGreaterThanTen = number -> number > 10;

        //boolean test Single Abstract Method()
        System.out.println("is 4 even? " + isEven.test(4));
        System.out.println("is 7 even? " + isEven.test(7));

        //default and() to combine two predicates
        Predicate<Integer> isEvenAndGreaterThanTen = isEven.and(isEven);
        System.out.println("Is 12 even and greater than 10?" + isEvenAndGreaterThanTen.test(12));
        System.out.println("Is 6 even and greater than 10? " + isEvenAndGreaterThanTen.test(6));

        //default negate()
        Predicate<Integer> isOdd = isEven.negate();
        System.out.println("Is 7 odd? " + isOdd.test(7));
        System.out.println("Is 6 odd? " + isOdd.test(7));

        //default or() to combine two predicates
        Predicate<Integer> isEvenOrGreaterThanTen = isEven.or(isEven);
        System.out.println("Is 12 even and greater than 10?" + isEvenOrGreaterThanTen.test(12));
        System.out.println("Is 6 even and greater than 10? " + isEvenOrGreaterThanTen.test(6));

        //static isEqual()
        // Static Methods can be Accessed by InterfaceName directly
        Predicate<Integer> isFive = Predicate.isEqual(5);
        System.out.println("Is 5 equal to 5? " + isFive.test(5));
        System.out.println("Is 5 equal to 10? " + isFive.test(10));

        //static not()
        // Static Methods can be Accessed by InterfaceName directly
        Predicate<Integer> notEven = Predicate.not(isEven);
        System.out.println("Is 5 not equal to 5? " + notEven.test(5));
        System.out.println("Is 5 not equal to 10? " + notEven.test(10));
    }

}
