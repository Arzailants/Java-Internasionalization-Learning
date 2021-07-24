package codelamps.belajar.java.i18n;

import org.junit.jupiter.api.Test;

import java.text.MessageFormat;

public class MessageFormatTest {

    @Test
    void testMessageFormat() {

        var pattern =  "Hi {0}, Anda bisa mencari data Anda dengan Mengetikkan \"{0}\" di pencarian";
        var messageFormat = new MessageFormat(pattern);

        // KETIKA KITA INGIN MERUBAH FORMAT DITENGAH JALAN
        // messageFormat.applyPattern();

        // MELAKUKAN FORMAT
        String format = messageFormat.format(new Object[]{"Andre"});

        // MENAMPILKAN
        System.out.println(format);
    }
}
