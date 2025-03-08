package hafta1.loops;

import java.util.Scanner;

public class PrimeNumberCheckerExample {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bir sayı giriniz: ");
        int number = scanner.nextInt();

        boolean isPrime = true;

        for (int i = 2; i < number ; i++) {
            if ((number % i) == 0 ) {
                isPrime = false;
            }

            }

        if (isPrime) {
            System.out.println(number + " bir asal sayıdır.");
        }
        else {
            System.out.println(number + " bir asal sayı değildir.");


        }
    }
}
