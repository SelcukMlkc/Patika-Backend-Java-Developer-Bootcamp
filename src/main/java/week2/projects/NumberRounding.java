package week2.projects;

import java.util.Scanner;

public class NumberRounding {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen bir ondalıklı sayı giriniz : ");
        double decimalNumber = scanner.nextDouble();

        System.out.println("Aşağı Yuvarlama : " + Math.floor(decimalNumber));

        System.out.println("Yukarı Yuvarlama : " + Math.ceil(decimalNumber));

        System.out.println("En Yakın Tam Sayı : " + Math.round(decimalNumber));
    }
}
