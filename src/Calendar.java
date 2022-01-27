import java.text.ParseException;
import java.time.LocalDate;

public class Calendar {
    public static void main(String[] args) throws ParseException {
        LocalDate birthday1 = LocalDate.of(1986, 3, 12);
        LocalDate birthday = getChronology(birthday1);
        System.out.println(birthday);
    }

    private static LocalDate getChronology(LocalDate birthday1) {
        LocalDate birthday = birthday1;
        return birthday;
    }
}

