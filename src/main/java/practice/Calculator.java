package practice;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Birinci sayıyı giriniz : ");
        double number1 = scanner.nextDouble();

        System.out.println("İşlemi seçiniz (+, -, *, /) : ");
        char operation = scanner.next().charAt(0);  // ilk karakteri aldım


        System.out.println("İkinci sayıyı giriniz : ");
        double number2 = scanner.nextDouble();

        double result = number1 + operation + number2;

        System.out.println("Sonuç : " + result);
    }
}
