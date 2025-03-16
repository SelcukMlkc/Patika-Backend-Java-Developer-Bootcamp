package week2.methods;

public class MethodTest {

    public static void main(String[] args) {

      /*  addNumbers(5, 2);

       // double sum = addNumbers(5, 7);  hatalı çünkü geri dünüş değeri yok

        double sum = addNumbers(6.4 , 15.2);  // Metod çağrıldı ama sonucu ekrana yazdırmadın!

        System.out.println("Toplam: " + sum);
    }

    private static void addNumbers(int number1, int number2) {

        int sum = number1 + number2;

        System.out.println("Toplam: " + sum);

    }

    private static double addNumbers(double number1, double number2) {  //metodlar fiil belirtir bu yüzden isimlendirirken fiil kullanıyoruz add.. gibi

        double sum = number1 + number2;

        //return number1 + number2; bu şekilde de olur

        return sum;

    } */

        Calculation calculation = new Calculation();

        calculation.showTitle();

        int square = calculation.calculateSquare(5);

        System.out.println("Square: " + square);

        calculation.addNumbers(5,6);

        double addNumbers = calculation.addNumbers();

        System.out.println(addNumbers);

        calculation.addNumbers1();




    }


}
