package week1.loops;

import java.util.Scanner;

public class WhileOddEvenCheckerExample {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen bir sayı giriniz: ");
        int number = scanner.nextInt();

        int i = 0;

        while (i <= number) {
            if (i % 2 == 0) {
                System.out.println(i + " bir çift sayıdır.");
            }
            else {
                System.out.println(i + " bir tek sayıdır");
            }
            i++ ;
        }
        scanner.close();
    }
}
