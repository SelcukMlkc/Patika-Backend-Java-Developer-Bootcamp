package week2.technicalContent3.samples;

public class KeywordTest {

    public static void main(String[] args) {

        Car car = new Car();

        System.out.println(car.getModel());
        System.out.println(car.getBrand());

        Car car1 = new Car("BMW");

        System.out.println(car1.getModel());
        System.out.println(car1.getBrand());

        Car car2 = new Car("BMW", "320");

        System.out.println(car2.getModel());
        System.out.println(car2.getBrand());

        //---


        System.out.println("super & this keyword");
       // Child child = new Child("message");

    }


}
