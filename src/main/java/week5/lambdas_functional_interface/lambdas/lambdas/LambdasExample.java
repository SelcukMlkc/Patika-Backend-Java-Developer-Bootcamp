package week5.lambdas_functional_interface.lambdas.lambdas;

public class LambdasExample {

    public static void main(String[] args) {

        Greeting greeting = new Greeting() {
            @Override
            public void method(String string) {
                System.out.println("Hello " + string);
            }
        };

        greeting.method("cem");

        // Java 8 sonrası :

        Greeting greeting1 = (name) -> System.out.println("Hello " + name);
        Greeting greeting2 = (name) -> {
            System.out.println("Hello " + name);
            System.out.println("Ben bir lambda metodum");
        } ;
        greeting1.method("cem");

        // lambdas
        // (parametre) -> {methodGövdesi}
        //eğer tek bir parametre varsa:  parametre -> methodGövdesi  =    Greeting greeting1 = name -> System.out.println("Hello " + name);


    }
}
