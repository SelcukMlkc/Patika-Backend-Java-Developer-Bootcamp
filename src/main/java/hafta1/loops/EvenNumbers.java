package hafta1.loops;

import java.util.Scanner;

public class EvenNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen bir sayı giriniz: ");
        int number = scanner.nextInt();

        for (int i = 0; i <= number ; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
