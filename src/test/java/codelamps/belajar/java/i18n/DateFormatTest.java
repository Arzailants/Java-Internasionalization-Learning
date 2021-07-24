package codelamps.belajar.java.i18n;

import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class DateFormatTest {
    
    // MEMBUAT TEST DATE FORMAT
    @Test
    void testDateFormat() {
        var pattern = "EEEE dd MMMM yyyy";
        var dateFormat = new SimpleDateFormat(pattern);

        var format = dateFormat.format(new Date());
        System.out.println(format);
    }



    // TEST INTERNATIONALIZATION DI DATE
    // AMERIKA
    @Test
    void testDateFormatAmerika() {
        var pattern = "EEEE dd MMMM yyyy";
        var amerika = new Locale("en", "US");
        var dateFormat = new SimpleDateFormat(pattern, amerika);

        var format = dateFormat.format(new Date());
        System.out.println(format);
    }




    // TEST INTERNATIONALIZATION DI DATE
    // JEPANG
    @Test
    void testDateFormatJepang() {
        var pattern = "EEEE dd MMMM yyyy";
        var jepang = new Locale("ja", "JP");
        var dateFormat = new SimpleDateFormat(pattern, jepang);

        var format = dateFormat.format(new Date());
        System.out.println(format);
    }




    // TEST INTERNATIONALIZATION DI DATE
    // THAILAND
    @Test
    void testDateFormatThailand() {
        var pattern = "EEEE dd MMMM yyyy";
        var thailand = new Locale("th", "TH");
        var dateFormat = new SimpleDateFormat(pattern, thailand);

        var format = dateFormat.format(new Date());
        System.out.println(format);
    }




    // TEST INTERNATIONALIZATION DI DATE
    // JEPANG
    @Test
    void testDateFormatParseAmerika() {
        var pattern = "EEEE dd MMMM yyyy";
        var amerika = new Locale("en", "US");
        var dateFormat = new SimpleDateFormat(pattern, amerika);

        try {
            var date = dateFormat.parse("Friday 23 July 2021");
            System.out.println(date);
        } catch (ParseException e){
            System.out.println("Parse Error " +e.getMessage());
        }
    }




    @Test
    void testDateFormatParseJepang() {
        var pattern = "EEEE dd MMMM yyyy";
        var jepang = new Locale("ja", "JP");
        var dateFormat = new SimpleDateFormat(pattern, jepang);

        try {
            var date = dateFormat.parse("金曜日 23 7月 2021");
            System.out.println(date);
        }catch (ParseException e){
            System.out.println("Parse Error = " +e.getMessage());
        }
    }
}
