package hafta1.ifElseSwitchCase;

public class ıfelse {

    public static void main(String[] args) {

        int number = 3;

        if (number >= 5) {
            // şart gerçekleşirse çalışacak
            System.out.println("Sayı 5'den büyük veya 5'e eşit");
        } else if (number < 0) {
            System.out.println("Sayı sıfırdan küçük");

        } else if (number == 3 && number > 0) {
            // şart doğru değilse bu kod bloğu çalışacak
            System.out.println("Sayı 3'e eşittir");
        }

        int not = 50;
        // sürekli System.out.println();- yazmamak için string tanımlamayı seçtik, temiz kodu amaçlıyoruz.

        String harfNotu;

        if (not >= 85) {
            harfNotu = "A";
        } else if (not >= 70) {
            harfNotu = "B";
        } else if (not >= 60) {
            harfNotu = "C";
        } else {
            harfNotu = ("D");
        }

            System.out.println(harfNotu);


        int age=25;
        int weight=48;

        if(age>=18){

            if(weight>=48){
                System.out.println("Kan verebilirsiniz");
            }
            else{
                System.out.println("Kan veremezsiniz");
            }

        }
        else{
            System.out.println("Kan verebilmek için yaşınız 18'den büyük olmalıdır.");
        }




    }


        }



