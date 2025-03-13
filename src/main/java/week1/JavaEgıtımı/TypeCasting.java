package week1.JavaEgıtımı;

public class TypeCasting {

    public static void main(String[] args) {

        //byte, short, int, long, float, double
        // Auto Widenning = Otamatik Genişletme
        // Explicit Narrowing = Açıkca Daratma

        byte sayiByte = 15;
        int sayiInt = sayiByte;  // Auto Widenning

        double sayiDouble = 25.3;
        // short sayiShort = sayiDouble;  böyle yapınca uyarı veriyor ve hata veriyor

        short sayiShort = (short) sayiDouble;  // bu şekilde devam etmesini sağlıyoruz  // Explicit Narrowing

        String sayi = "100";
        int tamSayı = Integer.parseInt(sayi);  //stringer tanımlı bir sayıyı integera çevirdik bu yöntemle

        System.out.println(tamSayı);

        String sayi2 = "35.44";
        double ondalıklıSayi = Double.parseDouble(sayi2);

        System.out.println(ondalıklıSayi);

        String yaziDegeri = String.valueOf(tamSayı);  //tam tersini yaptık, int degeriini stringe dönüştürdük

        System.out.println(yaziDegeri);





    }
}
