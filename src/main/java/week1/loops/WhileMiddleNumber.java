package week1.loops;

public class WhileMiddleNumber {
    public static void main(String[] args) {

        int left = 100, right = 200;
        while (++left < --right);  // buradaki ; işareti bu döngünün boş bir işlem yaptığını gösterir. Hatırlarsan normalde { kullanıyorduk.
        System.out.println("100 ile 200'ün ortası: " + left); // burada left yerine right da kullanabilirdim. döngünün durduğu yani false olduğu en son ki anı
        // kabul ediyor. En son left: 150 = right: 150 oluyor.
    }
}
