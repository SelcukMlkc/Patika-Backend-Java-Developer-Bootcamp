package practice;

import java.util.Scanner;

public class NarcissisticNumberCheck {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bir tam sayı giriniz : ");
        int number = scanner.nextInt();

        int birler = number % 10;
        int onlar = (number / 10) % 10;
        int yüzler = (number / 100) % 10;
        int binler = (number / 1000) % 10;

        //büüyk sayılar için kontrol edemez bu program!!!

        int sumOfCubes = (int) (Math.pow(birler, 3) + Math.pow(onlar, 3) + Math.pow(yüzler, 3) + Math.pow(binler, 3));

        if (sumOfCubes == number) {
            System.out.println(number + " bir narsist sayıdır!");
        } else {
            System.out.println(number + " bir narsist sayı değildir!");

            return;  // İlk bulduğumuz narsist sayıyı yazdırıp çıkıyoruz

        }


    }
}
