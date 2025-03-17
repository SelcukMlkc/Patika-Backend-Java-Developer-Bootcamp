package week2;

import java.util.Scanner;

public class boş {

    // Üs hesaplamak için recursive fonksiyon
    public static int usHesapla(int taban, int us) {
        // Base case: üs 0 ise, herhangi bir sayının 0. kuvveti 1'dir
        if (us == 0) {
            return 1;
        }
        // Recursive case: taban^us = taban * taban^(us-1)
        return taban * usHesapla(taban, us - 1);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan taban ve üs değerlerini al
        System.out.print("Tabanı girin: ");
        int taban = scanner.nextInt();

        System.out.print("Üssü girin: ");
        int us = scanner.nextInt();

        // Üs hesabını yap ve sonucu yazdır
        int sonuc = usHesapla(taban, us);
        System.out.println(taban + " üssü " + us + " = " + sonuc);

        scanner.close();
    }
}
