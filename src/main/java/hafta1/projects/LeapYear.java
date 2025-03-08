package hafta1.projects;

import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Yıl Giriniz :");
        int year = scanner.nextInt();

        //Leap Year Calculation

        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0 ){
            System.out.println(year + " bir artık yıldır !");

        } else {
            System.out.println(year + " bir artık yıldır değildir!");

        }

        scanner.close();


    }
}


/* farklı bir yöntem:
 public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Kullanıcıdan yıl değerini alıyoruz.
        System.out.print("Yıl Giriniz: ");

        int year = scanner.nextInt();

        boolean isLeapYear = false;

        //Artık yıl olup olmadığını tespit ediyoruz.
        if (year % 4 == 0) {
            isLeapYear = true;
        }

        if (isLeapYear) {
            if (year % 100 == 0 && year % 400 != 0) {
                isLeapYear = false;
            }
        }

        //Artık yıl olup olmadığı sonucunu ekrana yazdırıyoruz.
        System.out.println(isLeapYear ? (year + " bir artık yıldır!") : (year + " bir artık yıl değildir!"));

    }
}
 */
