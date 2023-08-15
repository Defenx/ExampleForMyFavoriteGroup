package mypackage;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;


public class Runner {

    public static void main(String[] args) {

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


        //сами придумайте пример

        go();
        hello();
        qwerty();
        takeMyMoney();
    }

    static void go(){
        System.out.println("walking");
    }

    static void hello() {
        System.out.println("hello");
    }

    static void qwerty() {
        System.out.println("qwerty");
    }
    static void takeMyMoney() {
        System.out.println("qwerty123");
    }
    static void giveMyMoney() {
        System.out.println("qwerty123");
    }
}
