package week2.technicalContent3.samples;

public class Child extends Parent{

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
    public String getMessage() {
        return message;
    }

    //override yazısı neden çıktı:
    //📌 Bu metot Parent sınıfındaki getMessage() metodunu ezmektedir.
    //📌 Yani Child nesnesi getMessage() metodunu çağırdığında artık Parent sınıfındaki değil, Child içindeki versiyon çalışır.
}
