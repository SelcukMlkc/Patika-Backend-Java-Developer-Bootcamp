package week5.beyond_classes.anonymous_class;

public class AnonymousExample {

    public static void main(String[] args) {

        Greeting greeting = new Greeting() {
            @Override
            public void sayHella() {

                System.out.println("Merhaba ben anonim bir class'ım!");

            }
        };

        greeting.sayHella();

        //---

        Greeting greeting1 = new GreetingImp();
        greeting1.sayHella();


        //---


        Animal dog = new Animal() {

            @Override
            void sound() {

                System.out.println("Köpekler havlar!");
            }
        };

        dog.sound();

        Animal animal = new Animal();
        animal.sound();

        //--

        Runnable runnable = new Runnable() {
            @Override
            public void run() {

                System.out.println("Anonim sınıfta çalışır");
            }
        };

        new Thread(runnable).start();

    }
}
