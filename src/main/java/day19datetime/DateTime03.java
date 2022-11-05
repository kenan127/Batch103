package day19datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

public class DateTime03 {

    public static void main(String[] args) {

        //Example 1: Japonya ile Almanya arasindaki zaman farkini saat olarak hesaplayan kodu yaziniz.

        LocalDateTime japan = LocalDateTime.now(ZoneId.of("Asia/Tokyo"));
        LocalDateTime almanya = LocalDateTime.now(ZoneId.of("Europe/Berlin"));

        long fark = ChronoUnit.HOURS.between(almanya,japan);
        System.out.println(fark);

        //Example 2: Sabit bir tarih olusturunuz.

        LocalDate myDate = LocalDate.of(2022, Month.APRIL,13);
        System.out.println(myDate); //2022-04-13

        /*
            1) Javada sabit datalari(Gun Isimleri, Ay isimleri, Amerikadaki eyalet isimleri etc.) depolamak ve gerektiginde kullanmak
            icin depolar olustururuz. Bu depolara "Enum" denir.

         */

        //Example 3: USA icin "Woow!", UK icin "Big", "CANADA" icin "Cold",
        // "TURKEY" icin "Vatan", "GERMANY" icin "Araba", "RWANDA" icin "Cay"

        Countries country = Countries.USA;

        switch(country){
            case USA:
                System.out.println("Woow!");
        }

    }
}
