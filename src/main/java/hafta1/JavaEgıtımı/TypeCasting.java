package hafta1.JavaEgıtımı;

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


    }
}
