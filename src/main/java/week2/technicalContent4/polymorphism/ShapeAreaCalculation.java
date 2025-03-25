package week2.technicalContent4.polymorphism;

import java.util.Scanner;

public class ShapeAreaCalculation {

    public static void main(String[] args) {

        /* Scanner scanner = new Scanner(System.in);
        System.out.println("Hangi şeklin alanını hesaplamak istersin?");
        System.out.println("1. Daire \n 2. Kare \n 3. Üçgen");

        int choise = scanner.nextInt();

        Shape shape = null;

        switch (choise){
            case 1:

                System.out.println("Dairenin yarıçapını giriniz: ");
                double radius = scanner.nextDouble();
                shape = new Circle(radius);
                break;

            case 2:

                System.out.println("Karenin kenar uzunluğunu giriniz : ");
                double side = scanner.nextDouble();
                shape = new Square(side);
                break;

            case 3:
                System.out.println("Üçgenin taban uzunluğunu giriniz :");
                double base = scanner.nextDouble();
                System.out.println("Üçgenin yüksekliğini giriniz : ");
                double height = scanner.nextDouble();
                shape = new Triangle(base, height);
                break;

            default:
                System.out.println("Geçersiz bir seçim yaptın!");


        }

        double calculateArea = shape.calculateArea();
        System.out.println("Alan = " + calculateArea);  */

        Circle circle = new Circle(7);

        Shape shape1 = new Circle(5);
        double calculateArea = shape1.calculateArea();
        System.out.println("Alan = " + calculateArea);

        Shape shape2 = new Square(5);
        calculateArea = shape2.calculateArea();
        System.out.println("Alan = " + calculateArea);

        Shape shape3 = new Triangle(5, 7);
        calculateArea = shape3.calculateArea();
        System.out.println("Alan = " + calculateArea);


    }
}
