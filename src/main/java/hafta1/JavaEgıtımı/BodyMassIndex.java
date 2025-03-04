package hafta1.JavaEgıtımı;

import java.util.Scanner;

public class BodyMassIndex {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz :");
        double boy = scanner.nextDouble();

        System.out.print("Lütfen kilonuzu giriniz : ");
        double kilo = scanner.nextDouble();

        double vki= kilo / (boy * boy);

        System.out.println("Vücut Kitle İndeksiniz : " + vki);

        scanner.close();



    }
}
