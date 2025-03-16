package week2.methods;

public class Factorial {

    //Recursive (Özyinelemeli)

    public static void main(String[] args) {

        int factorial = factorial(5);

        System.out.println("Factorial: " + factorial);

    }

    public static int factorial(int number) {

        if (number == 0) {  // eğer bunu yapmaz isen StackOverflowError hatası alırısn

            //Eğer if (number == 0) return 1; olmazsa, kod sonsuz döngüye girer ve çökmeye neden olur.
            //Çünkü fonksiyon kendini sürekli çağırır ve hiçbir zaman durmaz!

            return 1;
        }

        return number * (factorial(number-1));

    }


}
