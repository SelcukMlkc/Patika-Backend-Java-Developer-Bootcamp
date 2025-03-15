package week2.technicalContent1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DateAPIFormatingMain {

    public static void main(String[] args) {

        LocalDate today = LocalDate.now();

        System.out.println(today);

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ISO_DATE;

        System.out.println(today.format(dateTimeFormatter));

        System.out.println(today.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));  //Tarihin formatını değiştirdik, mm kulanamazsın. m dakikayı simgeliyor

        String stringDate = "25/01/2026";

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        LocalDate localDate = LocalDate.parse(stringDate, formatter); // LocalDate'in varsayılan toString() metodu, tarihi "yyyy-MM-dd" formatında döndürür.

        //parse() metodu, bir String ifadeyi belirli bir formata göre LocalDate, LocalTime veya LocalDateTime nesnesine çevirir.

        System.out.println("İleri tarih : " + localDate);

        System.out.println("İleri tarih : " + localDate.format(formatter));  // Eğer tarihi dd/MM/yyyy formatında göstermek istiyorsan, DateTimeFormatter.format() kullanmalısın.

        System.out.println("İleri tarihi : " + LocalDate.parse("2025-03-25"));

        // System.out.println("İleri tarihi : " + LocalDate.parse("25/03/2025"));  // Bu şekilde hata alıyoruz. ISO LOCAL DATE formatında olmadığı için
        // Bu hata, Java'nın LocalDate.parse() metodunun verilen String tarih formatını tanımaması nedeniyle oluşur.
        //
        //Java LocalDate.parse("2025-03-25") ifadesini doğrudan kabul eder,
        //çünkü "yyyy-MM-dd" ISO 8601 formatına uygundur.
        //
        //Ancak sen "25/03/2025" (dd/MM/yyyy formatında) vermişsin ve Java bunu otomatik olarak algılayamaz.

        LocalDateTime now = LocalDateTime.now();

        System.out.println(now);

        System.out.println(now.format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss")));

        System.out.println(now.format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm")));

        String stringDateTime = "25-02-2026 17:25:20";

        System.out.println(LocalDateTime.parse(stringDateTime, DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss")));  // parantez içinde dönüştürmek istediğimiz formatı değil
        // ilk formatı yazıyoruz.

        //daha açık bir şekilde yazıcam:

        String stringDateTime2 = "25-02-2026 17:25:20";  // Gün-Ay-Yıl formatında tarih ve saat

        // Java'ya bu formatta bir tarih geleceğini söylüyoruz
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        // String'i LocalDateTime'a çeviriyoruz
        LocalDateTime localDateTime = LocalDateTime.parse(stringDateTime2, formatter2);

        // Çıktıyı ekrana yazdırıyoruz
        System.out.println(localDateTime);


        LocalDateTime localDateTimeAustralia = ZonedDateTime.now(ZoneId.of("Australia/Sydney")).toLocalDateTime();

        System.out.println("Australia : " + localDateTimeAustralia);














    }
}
