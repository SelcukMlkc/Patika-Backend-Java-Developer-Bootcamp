package hafta1.projects;

import java.util.Scanner;

public class InvertedTriangle {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen basamak sayısını giriniz: ");
        int number = scanner.nextInt();

        for (int i = number; i >= 1 ; i--) {
        for (int j = 0; j < i ; j++) { //iç içe döngü kullanıyorum
            System.out.print("*"); //println yerine print yazarak yıldızları yan yana yazdırıyoruz

        }
            System.out.println(); // ilk iç döngü tamamlanıp ilk satır yıldızları yazdırdıktan sonra yeni döngü için yeni satıra geçmeyi sağlıyor bu
        }
scanner.close();

    }
}
