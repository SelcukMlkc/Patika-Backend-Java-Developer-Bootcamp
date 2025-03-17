package week1.projects;

import java.util.Scanner;

public class PrimeNumberChecker {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bir sayı giriniz: ");
        int number = scanner.nextInt();

        if (isPrime(number, 2)) {  // Fonksiyon recursive olarak ilk divisor = 2 ile başlıyor.
                                          // Daha sonra her çağrıda divisor + 1 artırılarak bölme işlemi devam ediyor.

            System.out.println(number + " bir asal sayıdır.");
        } else {
            System.out.println(number + " bir asal sayı değildir.");
        }

        scanner.close();
    }

    // Recursive asal sayı kontrolü yapan metod
    private static boolean isPrime(int number, int divisor) {
        if (number < 2) return false; // 1 ve 0 asal değildir
        if (divisor > number / 2) return true; // Sayıyı bölebilecek sayı kalmadıysa asaldır
        // Ancak tüm sayıları kontrol etmek yerine n/2’ye kadar kontrol etmek yeterlidir.
        //Çünkü bir sayının bölenleri n'in yarısına kadar olan sayılar içinde bulunur.

        if (number % divisor == 0) return false; // Eğer tam bölünüyorsa asal değil

        return isPrime(number, divisor + 1); // Sonraki böleni dene
    }
}
