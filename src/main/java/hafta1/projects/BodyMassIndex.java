package hafta1.projects;

import java.util.Scanner;

public class BodyMassIndex {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz :");
        double height = scanner.nextDouble();

        // Boyu metre cinsinden değilse, cm olarak girildiyse dönüştür

        if (height>=100) {
            height = height / 100;
        }

        System.out.print("Lütfen kilonuzu giriniz : ");
        double weight = scanner.nextDouble();

        // Eğer girilen boy veya kilo 0 veya negatifse, hatalı giriş mesajı veriyoruz

        if (height<=0 || weight<=0) {
            System.out.println("Hatalı giriş! Boy ve kilo pozitif olmalıdır.");
        }

        double vki= weight / (height * height);

        System.out.println("Vücut Kitle İndeksiniz : " + vki);

        scanner.close();



    }
}
