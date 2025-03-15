package week2.technicalContent1;

public class MathAPIMain {

    public static void main(String[] args) {

        System.out.println(Math.min(3,7));

        System.out.println(Math.min(-3,7));

        System.out.println(Math.max(-3,7));

        System.out.println(Math.round(35.45));

        System.out.println(Math.round(35.5));

        System.out.println(Math.round(35.55));

        System.out.println();

        System.out.println(Math.pow(5,2));  //karesini alıyor

        System.out.println(Math.random()); //0 ve 1 arasında rastgele ondalıklı sayı veriyor

        int rastgeleSayi = (int) (Math.random() * 10); // 0 ile 9 arasında tam sayı üretir
        System.out.println(rastgeleSayi);

        System.out.println();

        int min = 5;  // En küçük sayı
        int max = 15; // En büyük sayı
        int rastgeleSayi2 = (int) (Math.random() * (max - min + 1)) + min;
        System.out.println(rastgeleSayi2);

        //max - min + 1, belirtilen aralıktaki tam sayı sayısını belirler. Buradaki 1 max sayısını da dahil ediyor. O biri koymazsan en fazla 14 gelir. 2 yazarsan 16 da gelebilir.
        //+ min, sayıların min'den başlamasını sağlar.

        System.out.println();

        System.out.println(Math.abs(-10));  //mutlak değer

        System.out.println(Math.sqrt(4)); //sayının karekökünü alıyor

        System.out.println(Math.cbrt(27)); //küpkökünü alıyor

        System.out.println(Math.cos(0));
        System.out.println(Math.tan(45)); //bu 1 çıkmıyor çünkü bu radyan cinsinden çalışıyor derece olarak değil
        System.out.println(Math.tan(Math.PI/4));
        System.out.println();
        System.out.println(Math.tan(Math.toRadians(45))); // burada 45 dereceyi radyana çevirttirdim
        System.out.println(Math.sin(Math.PI/2));

        System.out.println(Math.toDegrees(Math.PI));








    }
}
