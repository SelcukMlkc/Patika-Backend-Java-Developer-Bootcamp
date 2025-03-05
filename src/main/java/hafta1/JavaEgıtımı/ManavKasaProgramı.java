package hafta1.JavaEgıtımı;

import java.util.Scanner;

public class ManavKasaProgramı {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double armutFiyat = 2.14;
        double elmaFiyat = 3.67;
        double domatesFiyat = 1.11;
        double muzFiyat = 0.95;
        double patlicanFiyat = 5.00;

        System.out.print("Armut Kaç Kilo ? :");
        double Armut = scanner.nextDouble();

        System.out.print("Elma Kaç Kilo ? :");
        double Elma = scanner.nextDouble();

        System.out.print("Domates Kaç Kilo ? :");
        double Domates = scanner.nextDouble();

        System.out.print("Muz Kaç Kilo ? :");
        double Muz = scanner.nextDouble();

        System.out.print("Patlican Kaç Kilo ? :");
        double Patlıcan = scanner.nextDouble();

        double deger = Armut * armutFiyat + Elma * elmaFiyat + Domates * domatesFiyat + Muz * muzFiyat + Patlıcan * patlicanFiyat;

        System.out.println("Toplam Tutar: " + deger);
    }
}
