package utility;

import java.util.function.Supplier;

public class CurrencyUtils {
    public static String indianCurrency() {
        return indianCurrencySupplier.get();
    }
    public static Supplier<String> indianCurrencySupplier = () -> {
        return "₹";
    } ;
}
