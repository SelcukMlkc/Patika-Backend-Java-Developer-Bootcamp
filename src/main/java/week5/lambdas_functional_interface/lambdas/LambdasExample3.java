package week5.lambdas_functional_interface.lambdas;

public class LambdasExample3 {

    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {

                System.out.println("Runnable çalışıyor!");
            }
        };

        new Thread(runnable).start();

        //Java 8 ve sonrası

        Runnable runnable1 = () -> System.out.println("Runnable çalışıyor...");

        new Thread(runnable1).start();
    }
}
