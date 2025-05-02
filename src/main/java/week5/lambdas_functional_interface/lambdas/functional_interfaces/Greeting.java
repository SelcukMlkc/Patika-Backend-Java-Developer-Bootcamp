package week5.lambdas_functional_interface.lambdas.functional_interfaces;

@FunctionalInterface
public interface Greeting {

    void sayHello();

    //void sayHello3(); functional interface içerisinde birden fazla abstract metod olamaz

    default void sayHello2() {
        System.out.println("default method");
    }
}
