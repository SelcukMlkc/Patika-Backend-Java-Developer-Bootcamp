package week2.methods.practices;

import java.util.Scanner;

public class RecursiveDigitSumExample {

    public static void main(String[] args) {

        // 123 > 3+2+1 = 6

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir sayı giriniz : ");
        int number = scanner.nextInt();

        int sum = sumOfDigit(number);

        System.out.println(number + " Sayısının basamak toplamı: " + sum);


    }

    private static int sumOfDigit(int number){

        if (number == 0) return 0;

        return (number % 10) + sumOfDigit(number/10);
    }
}
