package week2.technicalContent1;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class DateAPIMain {

    public static void main(String[] args) {

        System.out.println(LocalDateTime.now());

        System.out.println(LocalDate.now());

        System.out.println(LocalDate.now().plusDays(30));  //30 günlük süre belirledim

        System.out.println(LocalDate.now().plusMonths(3)); //3 aylık süre belirledim. Aynı şekilde yıl ve hafta da var

        var date = LocalDate.of(1994, 9, 26);

        System.out.println(date);

        System.out.println(LocalDate.now().minusDays(5));

        System.out.println(date.isBefore(LocalDate.now()));

        //örnek:

        var expireDate = LocalDate.of(2025, 3, 5);

        boolean isBefore = expireDate.isBefore(LocalDate.now());

        if (isBefore) {

            System.out.println("Paketinizin süresi dolmuştur!");
        }

        boolean after =  expireDate.plusMonths(5).isAfter(LocalDate.now());
        System.out.println(after);

        var blackFriday = LocalDate.of(2025, 3, 14);

        System.out.println("Haftanın günü : " + blackFriday.getDayOfWeek());


    }
}
