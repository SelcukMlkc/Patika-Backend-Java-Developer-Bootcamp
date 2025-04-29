package week5.lambdas_functional_interface.lambdas;

public class CheckIfSwim implements CheckTrait {

    @Override
    public boolean test(Animal animal) {
        return animal.canSwim();
    }
}
