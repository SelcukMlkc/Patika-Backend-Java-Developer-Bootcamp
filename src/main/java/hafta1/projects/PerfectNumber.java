package hafta1.projects;

import java.util.Scanner;

public class PerfectNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen bir sayı giriniz: ");
        int number = scanner.nextInt();

        int sum = 0;


        for (int i = 1; i < number ; i++) {
            if (number % i == 0) { //çarpanlarını bulduk
                sum += i; //çarpanların toplam değerini tanımladık
            }
        }
        // döngü bittikten sonra mükemmel sayı kontrolü yapıyoruz
            if (sum == number) {
                System.out.println(number + " Mükemmel Sayıdır!");
        } else {
                System.out.println(number + " Mükemmel Sayı Değildir!");
            }

            scanner.close();


        }

}
