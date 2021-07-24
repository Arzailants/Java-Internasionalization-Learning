package codelamps.belajar.java.i18n;

import org.junit.jupiter.api.Test;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatTest {

    @Test
    void testNumberFormat() {

        var numberFormat = NumberFormat.getInstance();
        var format = numberFormat.format(1000000.255);
        System.out.println(format);
    }



    @Test
    void testNumberFormatAmerika() {

        var amerika = new Locale("en","US");
        var numberFormat = NumberFormat.getInstance(amerika);
        var format = numberFormat.format(1000000.255);
        System.out.println(format);
    }



    @Test
    void testNumberFormatParseAmerika() {

        var amerika = new Locale("en", "US");
        var numberFormat = NumberFormat.getInstance(amerika);

        try {
            var format = numberFormat.parse("1,000,000.255");
            System.out.println(format);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
