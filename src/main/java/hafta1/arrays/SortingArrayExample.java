package hafta1.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SortingArrayExample {
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

        System.out.print("Kaç elemanlı bir dizi girmek istiyorsunuz? ");
    int size = scanner.nextInt();

    int[] numbers = new int[size];

        System.out.println(size + " adet sayısını giriniz!");

        for (int i = 0; i < size; i++) {

            System.out.println((i + 1) + ". sayıyı giriniz: ");
            numbers[i] = scanner.nextInt();
        }

        Arrays.sort(numbers);  // Bu bir diziyi (array) küçükten büyüğe sıralamak için kullanılır.

        for (int i = 0; i < numbers.length ; i++) {

            System.out.println(numbers[i]);

        }
    }
}
