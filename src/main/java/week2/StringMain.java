package week2;

public class StringMain {

    public static void main(String[] args) {

    var s = "lavanta";   //değişkenlerin türünü otomatik olarak belirlemek için kullanılır.

    String flower = "papatya"; //7 karakterden oluşuyor

    int length = flower.length();

        System.out.println(flower + " -> " + length + " karakterden oluşur.");

        char firstIndex = flower.charAt(0);
        System.out.println(firstIndex);

        // char a = flower.charAt(7); StringIndexOutOfBoundsException hatası alırız

        System.out.println(flower.indexOf('a')); //a harfinin kaçıncı index de olduğunu yazdırdık. Tam tersini yaptık yani.,

        System.out.println(flower.indexOf('a', 2)); //2. indexten aramaya başlattık bu sefer

        System.out.println(flower.substring(2));

        System.out.println(flower.substring(2,5)); // bitiş indexini dahil etmedi







    }

}
