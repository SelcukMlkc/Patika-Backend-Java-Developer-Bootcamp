package week2.methods;

import java.util.Scanner;

public class ParametreliMetotlar {

    public static void ortalamaAl (int sayi1, int sayi2) {

        double toplam = sayi1 + sayi2;

        double ortalama = toplam / 2 ;  // ❌ HATA: int / int olduğu için ondalık kısım kaybolur! int / int eşittir int oluyor. bu yüzden toplamı da double tanımlamalısın

        System.out.println(ortalama);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Bir sayı giriniz : ");
        int sayi1 = input.nextInt();

        System.out.println("İkinci sayıyı giriniz : ");
        int sayi2 = input.nextInt();

        ortalamaAl(sayi1, sayi2);

        ortalamaAl(40, 50);

        ortalamaAl(80, 20);

        ortalamaAl(14, 421);




    }
}
