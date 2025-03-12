package week1.projects;

import java.util.Scanner;

public class MatrixTranspose {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Dizinin satır sayısını giriniz = ");
        int x = scanner.nextInt();

        System.out.println("Dizinin sütun sayısını giriniz = ");
        int y = scanner.nextInt();

        int[][] matrix = new int[x][y];  //matrix boyutunu belirledik.
        int[][] transpose = new int[y][x];  // Transpoz matrisi (Boyutlar değiştirildi)

        System.out.println("Matrisin elemanlarını giriniz:");

        // Kullanıcıdan matris elemanlarını alıcaz
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print("matrix[" + i + "][" + j + "] = ");
                matrix[i][j] = scanner.nextInt();  //kullanıcıdan matrix değerlerini aldık
            }
        }

        // Bu değerleri Matris formatında ekrana yazdırcaz
        System.out.println("\nGirilen Matris:"); // "\n" ile bir satır aşağıya kaydırdım. Okunabilir olsun diye
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print(matrix[i][j] + "\t" ); // "\t" ile hizalı bir şekilde yazdırıyoruz
            }
            System.out.println(); // Satır tamamlanınca alt satıra geçmesini sağlıyoruz
        }

        // Transpoz Matrisi Yazdırcaz
        for (int i = 0; i < x; i++) {  // Sütunlar artık satır oldu
            for (int j = 0; j < y; j++) {  // Satırlar artık sütun oldu
                transpose[j][i] = matrix[i][j];  // Satır ve sütun değişimi yapıldı
            }
        }

        System.out.println("\nMatrisin Transpozu:");
        for (int i = 0; i < y; i++) { // Sütun kadar satır
            for (int j = 0; j < x; j++) { // Satır kadar sütun
                System.out.print(transpose[i][j] + "\t");
            }
            System.out.println();
        }

        scanner.close();
    }
}

