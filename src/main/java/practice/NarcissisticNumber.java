package practice;

public class NarcissisticNumber {

    public static void main(String[] args) {

        // En büyük 3 haneli narsist sayıyı hesaplayan program yazıcaz. Ve kullanıcının girdiği sayının narsist sayı olup olmadığını kontrol etmesini de istiyorum

        //Örnek 153 narsist sayıdır:  1’3 +5’3 + 3’3 =153

        // örnek xyz üç basamaklı bir sayı olsun.

        int number = 999;

        for (number = 999; number >= 100; number--) {
            int birler = number % 10;
            int onlar = (number / 10) % 10;
            int yüzler = (number / 100) % 10;

            int sumOfCubes = (int) (Math.pow(birler, 3) + Math.pow(onlar, 3) + Math.pow(yüzler, 3));

            if (sumOfCubes == number) {
                System.out.println("En büyük 3 haneli narsist sayı: " + number);
                return;  // İlk bulduğumuz narsist sayıyı yazdırıp çıkıyoruz

            }
        }
    }
}
