package week2.technicalContent3.samples;

public class Child extends Parent{   // final bir class ı extends edemezsin dibnot!

    //extends Parent açıklaması:
    //📌 Child sınıfı, Parent sınıfından miras alıyor (extends Parent).
    //📌 Child sınıfı, Parent sınıfındaki metodları ve değişkenleri kullanabilir veya ezebilir (override edebilir).

    private String message = "Message from Child";

    public Child() {
       // super(message);

        System.out.println(super.getMessage());
        System.out.println(this.getMessage());
    }

   /* public Child() {
    }

    public Child(String message) {
        this.message = message;
    }  */

    @Override
    public String getMessage() {   //finaller override edilemez. Yani bir metodu final olarak tanımlarsan,
        // bu metot alt sınıflar (subclass) tarafından override edilemez. Yani, değiştirilemez, sadece olduğu gibi kullanılabilir.
        return message;
    }

    //override yazısı neden çıktı:
    //📌 Bu metot Parent sınıfındaki getMessage() metodunu ezmektedir.
    //📌 Yani Child nesnesi getMessage() metodunu çağırdığında artık Parent sınıfındaki değil, Child içindeki versiyon çalışır.
}
