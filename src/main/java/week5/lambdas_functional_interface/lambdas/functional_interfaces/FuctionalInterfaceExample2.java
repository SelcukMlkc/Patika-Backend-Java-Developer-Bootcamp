package week5.lambdas_functional_interface.lambdas.functional_interfaces;

public class FuctionalInterfaceExample2 {

    public static void main(String[] args) {

        NumberChecker isEvenNumberChecker = number -> number % 2 == 0;

        System.out.println("10 çift sayı mı? :" + isEvenNumberChecker.check(10));
        System.out.println("7 çift sayı mı? :" + isEvenNumberChecker.check(7));
        System.out.println("8 çift sayı mı? :" + isEvenNumberChecker.check(8));
    }
}
