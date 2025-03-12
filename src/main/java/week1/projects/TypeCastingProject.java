package week1.projects;

import java.util.Scanner;

public class TypeCastingProject {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bir tam sayı giriniz = ");
        int integer = scanner.nextInt();

        System.out.println("Bir ondalıklı sayı giriniz = ");
        double decimalNumber = scanner.nextDouble();

        double castinginteger = integer;  // girilen tam sayıyı ondalıklı sayıya dönüştürdük

        int castingdouble = (int) decimalNumber;  // girilen ondalıklı sayıyı tam sayıya dönüştürdük

        System.out.println("Tam sayınızın ondalıklı sayıya dönüştürülmüş hali = " + castinginteger);
        System.out.println("Ondalıklı sayınızın tam sayıya dönüştürülmüş hali = " + castingdouble);



    }
}
