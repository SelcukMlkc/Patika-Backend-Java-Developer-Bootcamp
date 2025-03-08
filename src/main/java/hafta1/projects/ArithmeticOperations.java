package hafta1.projects;

import java.util.Scanner;

public class ArithmeticOperations {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in) ;

        /* Kullanıcıdan 3 değer alır:
        a = 1. sayı
        b = 2. sayı
        c = 3. sayı
         */

        System.out.println("1. sayıyı giriniz :");
        int a = scanner.nextInt();

        System.out.println("2. sayıyı giriniz :");
        int b = scanner.nextInt();

        System.out.println("3. sayıyı giriniz :");
        int c = scanner.nextInt();

        int sonuç = (a + b * c - b);
        System.out.println("Sonuç: " + sonuç);


    }
}
