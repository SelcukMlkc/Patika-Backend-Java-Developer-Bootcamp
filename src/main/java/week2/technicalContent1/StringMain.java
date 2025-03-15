package week2.technicalContent1;

public class StringMain {

    public static void main(String[] args) {

    var s = "Lavanta";   //değişkenlerin türünü otomatik olarak belirlemek için kullanılır.

    String flower = "Papatya"; //7 karakterden oluşuyor

    int length = flower.length();

        System.out.println(flower + " -> " + length + " karakterden oluşur.");

        char firstIndex = flower.charAt(0);
        System.out.println(firstIndex);

        // char a = flower.charAt(7); StringIndexOutOfBoundsException hatası alırız

        System.out.println(flower.indexOf('a')); //a harfinin kaçıncı index de olduğunu yazdırdık. Tam tersini yaptık yani.,

        System.out.println(flower.indexOf('a', 2)); //2. indexten aramaya başlattık bu sefer

        System.out.println(flower.substring(2));

        System.out.println(flower.substring(2,5)); // bitiş indexini dahil etmedi

        // System.out.println(flower.substring(5,2)); // StringIndexOutOfBoundsException

        System.out.println(flower.toUpperCase());  //kullanıcının girdiği string değerinin tüm harflerini büyük olarak yazdırıyor

        System.out.println(flower.toLowerCase());

        System.out.println("Lavanta".equals(flower));

        System.out.println("Papatya".equals(flower));

        System.out.println("papatya".equals(flower));

        System.out.println("papatya".equalsIgnoreCase(flower)); //Harflerin büyük ve küçük olması ile ilgilenmiyor bu sefer

        System.out.println();

        System.out.println(flower.startsWith("Pa"));  // string bu harflerle başlıyor mu diye soruyoruz

        System.out.println(flower.startsWith("pa"));

        System.out.println();

        System.out.println(flower.endsWith("tya"));

        System.out.println();

        System.out.println("flower".contains("f")); //burada flower ı inceledik. İçinde "f" harfi var mı diye baktık

        System.out.println(flower.contains("y")); // burada papatya yı inceledik

        System.out.println(flower.contains("ya")); //bu şekilde bitişik doğru yazman gerekir

        System.out.println(flower.contains("ay"));

        System.out.println(flower.replace('t', 'T')); //karakter değişimi yapıyoruz

        System.out.println(flower.replace('a', 'A'));



    }

}
