package practice;

import java.util.Scanner;

public class EbobEkok {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Birinci sayıyı giriniz = ");
        int number1 = scanner.nextInt();

        System.out.println("İkinci sayıyı giriniz = ");
        int number2 = scanner.nextInt();

        // önce ebob bulalım

        int ebob = 1;

        for (int i = 1; i <= Math.min(number1, number2) ; i++) {

            if ((number1 % i == 0) && (number2 % i == 0)) {

                ebob = i;

            }
        }

        System.out.println("Ebob = " + ebob);

        // şimdi ekok'unu bulalım

        int ekok = Math.max(number1, number2);

        double positiveInfinity = Double.POSITIVE_INFINITY;


        for (int i = ekok; i < positiveInfinity ; i++) {
            if((i % number1 == 0) && (i % number2 ==0)) {
                ekok = i;
                break;

            }

        }
        System.out.println("Ekok = " + ekok);


            }
        }




