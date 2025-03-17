package practice;

import java.util.Scanner;

public class NarcissisticNumberCheck2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bir tam sayı giriniz: ");
        int number = scanner.nextInt();

        if (isNarcissistic(number)) {
            System.out.println(number + " bir narsist (Armstrong) sayıdır!");
        } else {
            System.out.println(number + " bir narsist (Armstrong) sayı değildir!");
        }
    }

    public static boolean isNarcissistic(int number) {
        int originalNumber = number;  // Sayının orijinal halini sakla
        int basamakSayisi = 0;  // Basamak sayısını bulmak için değişken
        int temp = number;  // Sayıyı değiştirmeden kopyasını kullan

        // 1️⃣ Basamak sayısını bul
        while (temp > 0) {
            temp /= 10;
            basamakSayisi++;  //bu yöntem ile sayının basamak sayısını buldum
        }

        int sum = 0;  // Basamakların üssü toplamını saklayacak değişken
        temp = number; // Tekrar başa dönmek için temp'i orijinal sayıya eşitle

        // 2️⃣ Sayıyı basamaklarına ayır ve üssünü al
        while (temp > 0) {
            int basamak = temp % 10;  // Son basamağı al
            sum += Math.pow(basamak, basamakSayisi);  // Basamağın üssünü al ve toplama ekle
            temp /= 10;  // Sayıyı küçült, bir basamak eksilt
        }

        // 3️⃣ Orijinal sayı ile toplamı karşılaştır
        return sum == originalNumber;   // Bu satır boolean (true veya false) bir değer döndürür! if (isNarcissistic(number)) içini burada belirledik.

    }
}