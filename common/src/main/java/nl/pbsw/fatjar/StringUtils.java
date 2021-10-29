package nl.pbsw.fatjar;

public class StringUtils {

    public static boolean isEmpty(String string) {
        return string != null && string.trim().isEmpty();
    }

    public static boolean isNotEmpty(String string) {
        return !isEmpty(string);
    }
}
