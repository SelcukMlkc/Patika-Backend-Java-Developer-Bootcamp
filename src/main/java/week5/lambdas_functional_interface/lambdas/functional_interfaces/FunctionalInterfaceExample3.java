package week5.lambdas_functional_interface.lambdas.functional_interfaces;

public class FunctionalInterfaceExample3 {

    public static void main(String[] args) {

        Converter celsiusToFahrenheit = celsius -> (celsius * 1.8) + 32;

        celsiusToFahrenheit.printConversion(25);


    }
}
