package examples.functional_interface.user_defined;
@FunctionalInterface
public interface CheckEven {
    //abstract method
    boolean isEven(int number);
    //default method
    default boolean isOdd(int number) {
        return !isEven(number);
    }
    static boolean isEvenStatic(int number) {
        return number % 2 == 0;
    }
}
