package codelamps.belajar.java.i18n;

import org.junit.jupiter.api.Test;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class CurrencyNumberFormatTest {

    // TEST FORMAT
    @Test
    void testNumberFormatCurrencyIndonesia() {
        // MEMBUAT OBJEK LOCALE, DENGAN PARAMETER KODE BAHASA, DAN KODE NEGARA
        var amerika = new Locale("en","US");

        //
        var numberFormat = NumberFormat.getCurrencyInstance(amerika);

        //
        var format = numberFormat.format(1_000_000.900);
        System.out.println(format);

    }


    // TEST PARSING
    @Test
    void testNumberFormatCurrencyAmerikaParsing() {
        // MEMBUAT OBJEK LOCALE, DENGAN PARAMETER KODE BAHASA, DAN KODE NEGARA
        var amerika = new Locale("en","US");

        //
        var numberFormat = NumberFormat.getCurrencyInstance(amerika);

        //
        try {
            var parse = numberFormat.parse("$9,000,000.222");
            System.out.println(parse);
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
}
