package hafta1.JavaEgıtımı;

public class TernaryOperator {
    public static void main(String[] args) {

    String mesaj = "";

    int sayı = 12;

    if (sayı > 10) {
        mesaj = "Sayı 10'dan büyük";
    }
    else {
        mesaj = "Sayı 10 dan küçük";
    }
    System.out.println(mesaj);


    // şimdi ise bunu TernaryOperator ile kısaltarak yazacağız.

        mesaj = sayı > 10 ? "Sayı 10'dan büyük" : "Sayı 10'dan küçük";
        System.out.println(mesaj);
    //yada şu şekilde iç içe de yapabiliriz.
        mesaj = sayı > 10 ? "Sayı 5'dan büyük" : sayı < 5 ? "Sayı 5 ile 10 arasında" : "Sayı 5'den küçük";
            System.out.println(mesaj);


            // iç içe kullanımına başka bir örnek:


        int score = 85;

        String grade = (score > 90) ? "A" : (score > 80) ? "B" : (score > 70) ? "C" : "D";

        System.out.println("Notunuz: " + grade);

    }


}
