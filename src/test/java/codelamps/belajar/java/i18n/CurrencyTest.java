package codelamps.belajar.java.i18n;

import org.junit.jupiter.api.Test;

import java.util.Currency;
import java.util.Locale;

public class CurrencyTest {

    @Test
    void testCurrency() {
        var amerika = new Locale("en", "US");
        var currency = Currency.getInstance(amerika);

        System.out.println(currency.getDisplayName());
        System.out.println(currency.getCurrencyCode());
        System.out.println(currency.getSymbol());
    }



    @Test
    void testCurrencyIndonesia() {
        var indonesia = new Locale("id", "ID");
        var currency = Currency.getInstance(indonesia);

        System.out.println(currency.getDisplayName());
        System.out.println(currency.getCurrencyCode());
        System.out.println(currency.getSymbol());
    }
}
