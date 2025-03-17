package week2.methods.practices;

public class PalindromNumber2 {

    public static void main(String[] args) {

        for (int i = 1; i <= 1000; i++) {


            if (PalindromNumber.isPalindrom(i)) {   // Metodu başka sınıftan çağırıyoruz
                System.out.println(i + " bir palindrom sayıdır.");
            }

        }


    }
}



