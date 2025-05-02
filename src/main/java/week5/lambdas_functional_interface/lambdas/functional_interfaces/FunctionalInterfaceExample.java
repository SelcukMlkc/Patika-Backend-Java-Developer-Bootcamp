package week5.lambdas_functional_interface.lambdas.functional_interfaces;

public class FunctionalInterfaceExample {

    public static void main(String[] args) {

        MathOperation sum = (number1, number2) -> number1 + number2;
        MathOperation multiply = (a, b) -> a * b;

        //var multiplyv2 = (a, b) -> a * b;

        System.out.println("Toplam: " + sum.operate(2, 5));
        System.out.println("Çarpım: " + multiply.operate(3, 6));

    }
}
