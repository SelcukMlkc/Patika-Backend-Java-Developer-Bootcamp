package week2.methods.practices;

import java.util.Scanner;

public class PalindromNumber {

    public static void main(String[] args) {

        //Palindrom tersi de kendisi ile aynı olan sayılara denir. Örnek: 121

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bir sayı giriniz : ");
        int number =scanner.nextInt();

        boolean isPalindromNumber = isPalindrom(number);

        if (isPalindromNumber) {
            System.out.println("Bu bir palindrom sayıdır.");
        } else {
            System.out.println("Bu bir polindrom değildir.");
        }

    }

    protected static boolean isPalindrom(int number) {

        int originalNumber = number;

        int reversedNumber = 0 ;

        while (number>0) {

            int digit = number % 10;

            reversedNumber = (reversedNumber * 10) + digit;

            number /= 10; //number = number / 10 demek bu
        }

        return originalNumber == reversedNumber;


    }
}

/* örneğin 121 sayısı için çalışma mantığı:

digit = 121 % 10  = 1
reversedNumber = (0 * 10) + 1 = 1
number = 121 / 10 = 12


digit = 12 % 10  = 2
reversedNumber = (1 * 10) + 2 = 12
number = 12 / 10 = 1


digit = 1 % 10  = 1
reversedNumber = (12 * 10) + 1 = 121
number = 1 / 10 = 0 (Döngü biter)


originalNumber (121) == reversedNumber (121)  → Palindrom!

 */