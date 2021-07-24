package codelamps.belajar.java.i18n;

import org.junit.jupiter.api.Test;

import java.text.MessageFormat;
import java.util.Locale;
import java.util.ResourceBundle;

public class MessageFormatResourceBundleTest {

    @Test
    void testMessageFormatResourceBundle() {

        // MEMBUAT LOCALE
        var amerika = new Locale("en", "US");

        // MEMBUAT RESOURCE BUNDLE, UNTUK MEMANGGIL MESSAGE DI RESOURCE
        ResourceBundle resourceBundle = ResourceBundle.getBundle("message", amerika);

        // MENENTUKAN POLA PESAN
        var pattern = resourceBundle.getString("welcome.message");

        // MEMBUAT OBJEK MESSAGE FORMAT YANG INGIN DITAMPILKAN, SESUAI PATTERN
        MessageFormat messageFormat = new MessageFormat(pattern);

        // MEMASUKKAN INDEK, SESUAI PATTERN YANG DIMASUKKAN
        String daftarIndeksFormat = messageFormat.format(new Object[]{"Andre","Codelamps"});

        // TAMPILKAN
        System.out.println(daftarIndeksFormat);
    }




    @Test
    void testMessageFormatResourceBundleIndonesia() {

        // MEMBUAT LOCALE
        var indonesia = new Locale("in", "ID");

        //
        ResourceBundle resourceBundle = ResourceBundle.getBundle("message", indonesia);

        // POLA
        var pattern = resourceBundle.getString("welcome.message");

        // MEMANGGIL MESSAGE FORMAT, UNTUK MENAMPILKAN YANG INGIN DITAMPILKAN
        MessageFormat messageFormat = new MessageFormat(pattern);

        // DATA YANG INGIN DIMASUKKAN
        String dataInput = messageFormat.format(new Object[]{"Andre", "Codelamps"});

        // MENAMPILKAN
        System.out.println(dataInput);
    }
}
