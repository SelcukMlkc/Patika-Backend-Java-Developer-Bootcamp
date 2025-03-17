package week2.methods;

public class MethodExample {

    public static void main(String[] args) {

        //Aşağıda tanımladığımız metodları çağırıp yazdırcaz şimdi

        System.out.println(islem1(3, 7));
        System.out.println(islem2(3.57, 7.61));
        System.out.println(islem3("Selcuk" , " Malakcı"));



    }

    public static int islem1 (int a, int b) {

        return (a + b);
    }

    public static double islem2 (double x, double y) {

        return (x + y);

    }

    public static String islem3 (String name, String surname) {

        return (name + surname);
    }

}
