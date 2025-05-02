package week5.lambdas_functional_interface.lambdas.functional_interfaces;

@FunctionalInterface
public interface Converter {

    double convert(double value);

    default void printConversion(double value){
        System.out.println("Sonuç: " + convert(value));

    }
}
