package week5.lambdas_functional_interface.lambdas.method_reference;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class MethodReferenceExample {

    public static void main(String[] args) {

        //1 static method reference -> ClassName :: methodName
        //2 Instance method reference -> objectReference :: InstanceMethod
        //3: Instance method reference(Sınıf üzerinden) -> ClassName:: methodName
        //4: Constructor method reference -> ClassName::new


        //1 static method reference -> ClassName :: methodName
        BiFunction<Integer, Integer, Integer> sum = MathOperations::sum;
        System.out.println("Toplam: " + sum.apply(5,9 ));


        //2 Instance method reference -> objectReference :: InstanceMethod
        Printer printer = new Printer();
        Consumer<String> stringConsumer = printer::print;
        stringConsumer.accept("Merhaba method referance");


        //3: Instance method reference(Sınıf üzerinden) -> ClassName:: methodName
        List<String> names = Arrays.asList("Ahmet", "Veli", "Ayşe", "Fatma");
        names.forEach(System.out::println);


        //4: Constructor method reference -> ClassName::new
        Supplier<Car> carSupplier = Car::new;
        carSupplier.get();
        //Car car = carSupplier.get();


    }
}
