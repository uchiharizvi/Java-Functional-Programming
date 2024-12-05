package examples.functional_interface.user_defined;

public class CheckEvenImpl {
    public static void main(String[] args) {
        //lambda example
        CheckEven checkEven = number -> number % 2 == 0;
        System.out.println(checkEven.isEven(4));
        System.out.println(checkEven.isOdd(3));
        System.out.println(CheckEven.isEvenStatic(4));
    }
}
