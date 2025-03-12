package week1.JavaEgıtımı;

import java.util.Scanner;

public class TempratureExample {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Celsius cinsinden sıcaklık girin: ");
        double celsius = scanner.nextDouble();

        // F = (C *1.8 + 32)

        double F =(celsius * 1.8) + 32;

        System.out.println("C -> F = " + F);


    }
}
