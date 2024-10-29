package ex4;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {


    private static String pattern1 = "dd/MM/yyyy HH:mm:ss";

    public static String format(String pattern, Date date) {
        SimpleDateFormat formateur = new SimpleDateFormat(pattern);
        return formateur.format(date);
    }

    public static String formatDefaut(Date date) {
        return format(pattern1, date);
    }
}
