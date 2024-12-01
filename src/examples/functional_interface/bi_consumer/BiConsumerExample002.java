package examples.functional_interface.bi_consumer;

import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.stream.Stream;

/**
 * BiConsumer takes 2 arguments and returns void
 * BiPredicate<T,U> takes 2 arguments and performs boolean operation on 2 values
 */
public class BiConsumerExample002 {
    public static void main(String[] args) {
        BiPredicate<Integer, Boolean> isEligibleForDiscount = (age, isMember) ->
                age >= 60 || isMember;
        BiConsumer<String, Boolean> printEligibilityMessage = (message, result) ->
                Stream.of(result)
                        .map(isEligible -> isEligible
                                ? message + ": is Eligible for Discount"
                                : message + ": is not Eligible for Discount")
                        .forEach(System.out::println);


        printEligibilityMessage.accept("User with age of 65 and is a member", isEligibleForDiscount.test(65, true));
        printEligibilityMessage.accept("User with age of 65 and is not a member",isEligibleForDiscount.test(65, false));
        printEligibilityMessage.accept("User with age of 59 and is not a member",isEligibleForDiscount.test(59, false));
        printEligibilityMessage.accept("User with age of 59 and is a member",isEligibleForDiscount.test(59, true));
    }
}
