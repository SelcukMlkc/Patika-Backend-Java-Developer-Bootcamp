package week1.loops;

public class MultiplicationTable {

    public static void main(String[] args) {

    for(int i = 1; i <= 10; i++) {
        for(int j = 1; j <= 10; j++) {
            System.out.printf("%d * %d = %d", i, j, i * j);
            /* Java'da System.out.printf, formatlı çıktı almak için kullanılan bir komuttur.
Normal System.out.print veya System.out.println'dan farkı, çıktıyı daha düzenli ve biçimli hale getirmesidir.

✅ printf ifadesindeki "f", "formatted" (biçimlendirilmiş) anlamına gelir.
✅ Özel format belirteçleri (%d, %s, %f vb.) kullanarak, sayıları veya metinleri istediğimiz şekilde düzenleyebiliriz.
*/

            System.out.println();
        }
        System.out.println();
    }
    }
}
