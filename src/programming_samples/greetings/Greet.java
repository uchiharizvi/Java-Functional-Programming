package programming_samples.greetings;

import java.util.List;
import java.util.function.*;

public class Greet {
    public static void main(String[] args) {
        Supplier<List<String>> nameSupplier = () -> List.of("John", "Alice", "Michael", "Emma");
        Consumer<String> greetingConsumer = greeting -> System.out.println("Hello " + greeting+"!");
        Predicate<String> isMale = name -> name.equalsIgnoreCase("John") || name.equals("Michael");
        BiFunction<Boolean,String, String> greetingFunction = (gender, name) ->
                gender ? "Mr. " + name : "Mrs. " + name;
        nameSupplier.get().forEach( name -> {
            String greeting = greetingFunction.apply(isMale.test(name), name);
            greetingConsumer.accept(greeting);
        });
    }
}
