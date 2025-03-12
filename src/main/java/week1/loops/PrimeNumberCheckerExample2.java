package week1.loops;

import java.util.Scanner;

public class PrimeNumberCheckerExample2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir sayı giriniz:");
        int number = scanner.nextInt();

        for (int i = 2; i <= number ; i++) {

            boolean isPrime = true;
            for (int j = 2; j < i ; j++) {

                if (i % j == 0) {
                    isPrime = false;
                    break;
                }

            }
            if (isPrime){
                System.out.println(i + " sayısı asal sayıdır.");
            }
            else {
                System.out.println(i + " sayısı asal sayı değildir.");
            }

        }
    }
}
