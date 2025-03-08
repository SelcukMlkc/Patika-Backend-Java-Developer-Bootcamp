package hafta1.loops;

import java.util.Scanner;

public class WhileOddEvenCheckerExample2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen bir sayı giriniz: ");
        int number = scanner.nextInt();

        // Pozitif sayılar için i = 0'dan ileriye, negatifler için geriye gidecek
        int i = 0;

        while (number >= 0 ? i <= number : i >= number) {
            if (i == 0) {
                System.out.println(i + " nötr bir sayıdır.");
            } else if (i % 2 == 0) {
                System.out.println(i + " bir çift sayıdır.");
            } else {
                System.out.println(i + " bir tek sayıdır.");
            }

            i += (number >= 0 ? 1 : -1);  // Pozitifse artır, negatifse azalt
        }

        scanner.close();
    }
}



