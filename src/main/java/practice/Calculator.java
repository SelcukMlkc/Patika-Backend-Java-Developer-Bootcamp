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

        double result = 0;

        switch (operation) {
            case '+':
                result = number1 + number2;
                break;
            case '-':
                result = number1 - number2;
                break;
            case '*':
                result = number1 * number2;
                break;
            case '/':
                if (number2 != 0) {
                    result = number1 / number2;
                } else {
                    System.out.println("Sıfıra bölme hatası!");
                    return;
                }
                break;
            default:
                System.out.println("Geçersiz işlem!");
                return;
        }

        System.out.println("Sonuç : " + result);


    }
}
