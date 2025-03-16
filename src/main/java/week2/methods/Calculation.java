package week2.methods;

public class Calculation {

    double pi = 3.14;

    public void showTitle() {

        System.out.println("Hoş Geldiniz!");

    }

    public int calculateSquare(int number) {

        return number * number;

    }

    protected void addNumbers(int number1, int number2) {

        int sum = number1 + number2;

        System.out.println("Toplam: " + sum);

    }

    private double addNumbers(double number1, double number2) {  //metodlar fiil belirtir bu yüzden isimlendirirken fiil kullanıyoruz add.. gibi

        double sum = number1 + number2;

        //return number1 + number2; bu şekilde de olur

        return sum;

    }

    protected double addNumbers() {

        double pi =3;
        return 10 * pi;

    }

    protected void addNumbers1() {   //body'siz yazamazsın bunu. Süslü parantez olmak zorunda yani
        //privated iken başka yerden buraya ulaşamıyoruz

        // boş ama geçerli bir metod

        System.out.println(10 * pi);

    }

}

