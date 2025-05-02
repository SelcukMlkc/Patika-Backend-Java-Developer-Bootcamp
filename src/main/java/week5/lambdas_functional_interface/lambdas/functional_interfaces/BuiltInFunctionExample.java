package week5.lambdas_functional_interface.lambdas.functional_interfaces;

import java.util.function.Function;

public class BuiltInFunctionExample {

    public static void main(String[] args) {

        Function<String, Integer> lengtFunction = str -> str.length();

        System.out.println("Kelmienin Uzunluğu: " + lengtFunction.apply("Merhaba patika"));
    }
}
