package week1.loops;

import java.util.Scanner;

public class forExample {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // faktöryel hesabı yapacağız.

        System.out.println("Bir sayı giriniz: ");
        int number = scanner.nextInt();

        int factorial = 1;

        for (int i = 1; i <= number ; i++) {

            factorial = factorial * i;
        }

        System.out.println(number + "! : " + factorial);

        }
    }

