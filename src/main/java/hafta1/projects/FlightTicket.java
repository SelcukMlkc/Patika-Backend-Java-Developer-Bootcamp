package hafta1.projects;

import java.util.Scanner;

public class FlightTicket {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Mesafeyi km türünden giriniz: ");
        double Mesafe = scanner.nextDouble();

        System.out.println("Yaşınızı giriniz :");
        double Yaş = scanner.nextDouble();

        System.out.println("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ):");
        double Tip = scanner.nextDouble();

        double fiyat = Mesafe * 0.10;
        if (Tip == 2) {
            // bu durumda %20 indirim uygulanıyor
            fiyat = fiyat * 2 * 0.8;
        }


        if (Mesafe < 0 || Yaş < 0 || (Tip != 1 && Tip != 2)) {
            System.out.println("Hatalı Veri Girdiniz !");
            // return kullanmamızın sebebi hesaplamaya devam etmemesi için
        return;
        }

        if (Yaş < 12) {
            // bu durumda %50 indirim isteniyor
            System.out.println("Toplam Tutar: " + fiyat * 0.5);
        }
        else if (Yaş >=12 && Yaş<=24) {
            // bu durumda %10 indirim isteniyor
            System.out.println("Toplam Tutar: " + fiyat * 0.9);
        }
        else if (Yaş > 65) {
            // bu durumda %30 indirim isteniyor
            System.out.println("Toplam Tutar: " + fiyat * 0.7);
        }

        else {
            System.out.println("Toplam Tutar: " + fiyat);
        }




            }


        }













