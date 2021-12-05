package view;

import java.time.LocalDate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringLocalDateConverter {

    public static LocalDate stringToLocalDate(String string) {

        if (string != null && !string.equals("")) {
            Matcher matcher = Pattern.compile("([0-9]+)/([0-9]+)/([0-9]+)").matcher(string);
            if (matcher.find()) {
                int day = Integer.parseInt(matcher.group(1));
                int month = Integer.parseInt(matcher.group(2));
                int year = Integer.parseInt(matcher.group(3));
                return LocalDate.of(year, month, day);
            }
            throw new RuntimeException();
        } else {
            return null;
        }
    }

    public static String localDateToString(LocalDate localDate) {
        if (localDate != null) {
            return new StringBuilder()
                    .append(localDate.getDayOfMonth())
                    .append("/")
                    .append(localDate.getMonthValue())
                    .append("/")
                    .append(localDate.getYear())
                    .toString();
        } else {
            return "";
        }
    }
}

