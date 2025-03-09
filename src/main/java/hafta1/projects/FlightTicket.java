package hafta1.projects;

import java.util.Scanner;

public class FlightTicket {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // int distance, age, direction ; sonrasında age = input.NextInt() şeklinde de yapabilirdim.

        System.out.println("Mesafeyi km türünden giriniz: ");
        int distance = scanner.nextInt();

        System.out.println("Yaşınızı giriniz :");
        int age = scanner.nextInt();

        System.out.println("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ):");
        int direction = scanner.nextInt();

        double price = distance * 0.10;
        if (direction == 2) {
            // bu durumda %20 indirim uygulanıyor
            price = price * 2 * 0.8;
        }

        if (distance < 0 || age < 0 || (direction != 1 && direction != 2)) {
            System.out.println("Hatalı Veri Girdiniz !");
            // return kullanmamızın sebebi hesaplamaya devam etmemesi için
        return;
        }

        //Bizden istenilene göre önce önce yaş indirimi sonra yolculuk tipi indirimi yapmamızı istiyor ve bizde ona göre yapıcaz.

        if (age < 12) {
            // bu durumda %50 indirim isteniyor
            System.out.println("Toplam Tutar: " + price * 0.5);
        }
        else if (age >=12 && age<=24) {
            // bu durumda %10 indirim isteniyor
            System.out.println("Toplam Tutar: " + price * 0.9);
        }
        else if (age > 65) {
            // bu durumda %30 indirim isteniyor
            System.out.println("Toplam Tutar: " + price * 0.7);
        }

        else {
            System.out.println("Toplam Tutar: " + price);
        }

            }

        }













