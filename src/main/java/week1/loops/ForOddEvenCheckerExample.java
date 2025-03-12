package week1.loops;

import java.util.Scanner;

public class ForOddEvenCheckerExample {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen bir sayı giriniz: ");
        int number = scanner.nextInt();

        for (int i = 0; i <= number ; i++) {

            if (i % 2 == 0) {
                System.out.println(i + " sayısı çift sayıdır.");
            }
            else {
                System.out.println(i + " sayısı tek sayıdır.");
            }
        }
    }
}
