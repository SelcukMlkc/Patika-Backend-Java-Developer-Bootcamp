package hafta1.JavaEgıtımı;

import java.util.Scanner;

public class AritmetikIslemler {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in) ;

        System.out.println("a :");
        int a = scanner.nextInt();

        System.out.println("b :");
        int b = scanner.nextInt();

        System.out.println("c :");
        int c = scanner.nextInt();

        int sonuç = (a + b * c - b);
        System.out.println("Sonuç: " + sonuç);


    }
}
