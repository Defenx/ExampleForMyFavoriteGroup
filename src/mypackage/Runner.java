package mypackage;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;


public class Runner {

    public static void main(String[] args) {

        LocalTime now = LocalTime.now();

        //Date - не используем
        //Calendar -- используемый, но редко

        //работаем без привязки часовых поясов
        //LocalDate -- позволяет работать с датой(год, месяц, день) БЕЗ УЧЕТА ВРЕМЕНИ!
        //LocalDateTime -- позволяет работать с датой и временем
        //LocalTime -- позволяет работать с временем (час, минуты, секунды, наносекунды, ...)

        //работаем с TimeZone
        //используем Zoned...

        //Instant -- представление времени в виде секунд от 1970 до текущей даты

        //Period
        //Duration


        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale.ENGLISH);

        LocalDate parse = LocalDate.parse("08 July 2023", dateTimeFormatter);
        System.out.println(parse);

        LocalTime now1 = LocalTime.now();

        Duration between = Duration.between(now, now1);
        System.out.println(between.getNano());

    }
}
