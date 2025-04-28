package week5.beyond_classes.local_class;

public class LocalClassExample1 {

    public void display() {  //metod

        class local {

            void message() {
                System.out.println("Local class!");
            }
        }

        local local = new local();
        local.message();
    }
}
