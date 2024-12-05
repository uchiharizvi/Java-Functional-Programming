package examples.functional_interface.pre_defined.bi_function;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;

public class BiFunctionExample001 {
    public static void main(String[] args) {
        BiFunction<Integer, Boolean, Double> calculateDiscount = (age, isMember) -> {
            double discount = 0.0;
            // Apply discount logic: Age > 65 or membership status
            if (age > 65) {
                discount = 20.0;  // 20% discount for senior citizens
            } else if (isMember) {
                discount = 10.0;  // 10% discount for members
            } else {
                discount = 0.0;   // No discount if neither condition is met
            }
            return discount;  // Return discount percentage
        };
        BiConsumer<String, Double> printEligibilityMessage = (userMessage, discount) ->
                System.out.println(userMessage + ": is eligible for a " + discount + "% Discount");
        //test
        printEligibilityMessage.accept("User with age 70 and is a member", calculateDiscount.apply(70, true));
        printEligibilityMessage.accept("User with age 60 and is a member", calculateDiscount.apply(60, true));
        printEligibilityMessage.accept("User with age 70 but is not a member", calculateDiscount.apply(70, false));
        printEligibilityMessage.accept("User with age 59 and is not a member", calculateDiscount.apply(59, false));
    }
}
