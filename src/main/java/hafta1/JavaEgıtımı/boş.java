package hafta1.JavaEgıtımı;

import java.util.Scanner;

public class boş {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int km,yas,tip;
        System.out.println("Mesafeyi km cinsinden giriniz");
        km = scanner.nextInt();

        System.out.println("Yaşı giriniz");
        yas = scanner.nextInt();

        System.out.println("Yolculuk tipini giriniz (1=Tek Gidiş , 2=Gidiş/Dönüş)");
        tip = scanner.nextInt();

        double normalFiyat,yasIndirimi,tipIndirimi;

        if (km > 0 && yas > 0 && (tip==1 || tip==2)) {
            normalFiyat = km * 0.10;
            if (yas < 12) {
                yasIndirimi = normalFiyat * 0.50;
            } else if (yas >= 12 && yas <= 24) {
                yasIndirimi = normalFiyat * 0.10;
            } else if (yas >= 65) {
                yasIndirimi = normalFiyat * 0.30;
            } else {
                yasIndirimi = 0;
            }
            normalFiyat -= yasIndirimi;
            if (tip == 2) {
                tipIndirimi = normalFiyat * 0.20;
                normalFiyat = (normalFiyat - tipIndirimi) * 2;
            }
            System.out.println("Bilet tutarı : " + normalFiyat);
        } else {
            System.out.println("Hatalı Veri Girdiniz!");
        }



    }
}