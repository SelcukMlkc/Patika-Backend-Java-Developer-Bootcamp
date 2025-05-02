package week5.lambdas_functional_interface.lambdas.lambdas;

public class CheckIfHopper implements CheckTrait {


    @Override
    public boolean test(Animal animal) {
        return animal.canHop();
    }
}
