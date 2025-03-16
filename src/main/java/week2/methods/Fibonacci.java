package week2.methods;

public class Fibonacci {

    public static void main(String[] args) {

        int fibonacci = fibonacci(8);

        System.out.println("Fibonacci sayısı : " + fibonacci);


                // 0 1 1 2 3 5 8 13 21 ...

    }

    private static int fibonacci(int number) {

        if ( number == 0) {
            return 0;

        }

        if (number == 1) {
            return 1;
        }

        else {

            return fibonacci(number - 1) + fibonacci(number - 2) ;   // Bu satır da Fibonacci dizisinin tanımını yapdık
        }




    }
}
