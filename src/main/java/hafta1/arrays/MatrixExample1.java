package hafta1.arrays;

import java.util.Scanner;

public class MatrixExample1 {

    public static void main(String[] args) {

        int matrix[][] = new int[3][4];  // matris boyutunu belirledik
        Scanner input = new Scanner(System.in);
        System.out.println("Enter " + matrix.length + " rows and "
                + matrix[0].length + " columns: ");  // kullanıcıdan matrix değerlerini girmesini istiyoruz
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                matrix[row][column] = input.nextInt();  // kullanıcın girdiği değeri matrixe ekler
            }
            }
        }
}