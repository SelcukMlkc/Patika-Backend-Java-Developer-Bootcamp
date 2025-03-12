package week1.JavaEgıtımı;

import java.util.Scanner;

public class TemelPratiklerScanner {

    public static void main(String [] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Adınızı Giriniz: ");
        String name = scanner.nextLine();

        System.out.print("Yaşınızı Giriniz: ");
        int age = scanner. nextInt();

        System.out.println("Merhaba " + name + ", " + age + " yaşındasın!");

        scanner.close();




    }
}
