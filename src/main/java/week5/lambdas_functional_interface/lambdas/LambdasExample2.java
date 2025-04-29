package week5.lambdas_functional_interface.lambdas;

import java.util.ArrayList;
import java.util.List;

public class LambdasExample2 {

    public static void main(String[] args) {

        var animals = new ArrayList<Animal>();
        animals.add(new Animal("fish", false, true));
        animals.add(new Animal("kangaroo", true, false));
        animals.add(new Animal("rabbit", true, false));
        animals.add(new Animal("turtle", false, true));

        // Java 8 öncesi:

        //print(animals, new CheckIfHopper());
        //print(animals, new CheckIfSwim());

        // Java 8 sonrası:
        //print(animals, a -> a.canHop());
        //print(animals, a -> a.canSwim());
        //print(animals, a -> a.canSwim() && !a.canHop());
        print(animals, a -> {
            System.out.println("Lambdas ifadeleri");
            return !a.canSwim();
        });

        //var invalid (Animal animal) -> animal.canHop();

        //boolean valid = (Animal a) -> return.a.canHop();
    }

    private static void print(List<Animal>animalList, CheckTrait checker) {

        for (Animal animal : animalList) {
            if (checker.test(animal)) {
                System.out.print(animal + " ");
            }
        }
    }
}
