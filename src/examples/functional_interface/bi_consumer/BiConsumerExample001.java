package examples.functional_interface.bi_consumer;

import java.util.function.BiConsumer;

/**
 * BiConsumer takes 2 arguments and returns void
 */
public class BiConsumerExample001 {
    public static void main(String[] args) {
        //Bi Consumer to print student name and grade
        BiConsumer<String, Integer> printInfo = (name, grade) ->
                System.out.println("Name : " + name + ", Grade: " + grade);

        //Invoke BiConsumer
        printInfo.accept("Alice", 85);
        printInfo.accept("Susan", 95);
        printInfo.accept("Eddie", 99);
    }
}
