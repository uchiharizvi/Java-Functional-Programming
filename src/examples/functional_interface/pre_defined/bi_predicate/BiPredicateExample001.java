package examples.functional_interface.pre_defined.bi_predicate;

import java.util.function.BiPredicate;

/**
 * BiPredicate<T,U> takes 2 arguments and performs boolean operation on 2 values
 */
public class BiPredicateExample001 {
    public static void main(String[] args) {
        BiPredicate<Integer, Boolean> isEligibleForDiscount = (age, isMember) ->
                age>=60 || isMember;

        System.out.println("Age: 65, Member : true -> " + isEligibleForDiscount.test(65, true));//eligible
        System.out.println("Age: 40, Member: true -> " + isEligibleForDiscount.test(40, false));//not eligible
    }
}
