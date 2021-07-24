package codelamps.belajar.java.i18n;

import org.junit.jupiter.api.Test;

import java.util.Locale;

public class LocaleTest {

    @Test
    void testNewLocale() {
        var language = "id";
        var country = "ID";
        var Locale = new Locale(language, country);

        System.out.println(Locale.getLanguage());
        System.out.println(Locale.getCountry());

        System.out.println(Locale.getDisplayLanguage());
        System.out.println(Locale.getDisplayCountry());
    }

    @Test
    void testNewLocaleUS() {
        var language = "en";
        var country = "US";
        var Locale = new Locale(language, country);

        System.out.println(Locale.getLanguage());
        System.out.println(Locale.getCountry());

        System.out.println(Locale.getDisplayLanguage());
        System.out.println(Locale.getDisplayCountry());
    }
}
