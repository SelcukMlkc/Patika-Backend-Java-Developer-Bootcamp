package practice;

import java.util.Scanner;

/* Sınıflar main metodunun içinde tanımlanamaz!
Çözüm: Mızrakcı, Lejyoner, Atlı sınıflarını BattleSimulator dışında tanımlamalısın.
Sınıflar nesne üretmek için kullanılmalı, değişkenlerin statik olmaması lazım.
Çözüm: Her birim için bir constructor kullanarak nesneler oluşturmalısın.
 */

class Mızrakcı {
    int saldırı;
    int atlıSavunma;
    int yayaSavunma;

    public Mızrakcı() {       // nesne tanımlama
        this.saldırı = 10;
        this.atlıSavunma = 60;
        this.yayaSavunma = 30;
    }
}

class Lejyoner {
    int saldırı;
    int atlıSavunma;
    int yayaSavunma;

    public Lejyoner() {
        this.saldırı = 30;
        this.atlıSavunma = 20;
        this.yayaSavunma = 50;
    }
}

class Atlı {
    int saldırı;
    int atlıSavunma;
    int yayaSavunma;

    public Atlı() {
        this.saldırı = 80;
        this.atlıSavunma = 20;
        this.yayaSavunma = 20;
    }
}

public class BattleSimulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan birim sayılarını al
        System.out.println("Saldıran Mızrakcı sayısı = ");
        int mızrakcıA = scanner.nextInt();

        System.out.println("Saldıran Lejyoner sayısı = ");
        int lejyonerA = scanner.nextInt();

        System.out.println("Saldıran Atlı sayısı = ");
        int atlıA = scanner.nextInt();

        System.out.println("Savunan Mızrakcı sayısı = ");
        int mızrakcıDef = scanner.nextInt();

        System.out.println("Savunan Lejyoner sayısı = ");
        int lejyonerDef = scanner.nextInt();

        System.out.println("Savunan Atlı sayısı = ");
        int atlıDef = scanner.nextInt();

        // Savaş hesaplamasını yap
        calculateBattle(mızrakcıA, lejyonerA, atlıA, mızrakcıDef, lejyonerDef, atlıDef);
    }

    public static void calculateBattle(int mızrakcıA, int lejyonerA, int atlıA, int mızrakcıDef, int lejyonerDef, int atlıDef) {
        Mızrakcı mızrakcı = new Mızrakcı();  //Yeni nesneler oluşturuyoruz
        Lejyoner lejyoner = new Lejyoner();
        Atlı atlı = new Atlı();

        // Toplam saldırı gücü
        int saldırıGücü = (mızrakcıA * mızrakcı.saldırı) + (lejyonerA * lejyoner.saldırı) + (atlıA * atlı.saldırı);

        // Toplam savunma gücü
        int savunmaGücü = (mızrakcıDef * mızrakcı.yayaSavunma) + (lejyonerDef * lejyoner.yayaSavunma) + (atlıDef * atlı.atlıSavunma);

        // Sonucu hesapla
        if (saldırıGücü > savunmaGücü) {
            System.out.println("🔥 Saldıranlar kazandı! (Saldırı: " + saldırıGücü + ", Savunma: " + savunmaGücü + ")");
        } else if (saldırıGücü < savunmaGücü) {
            System.out.println("🛡️ Savunanlar kazandı! (Saldırı: " + saldırıGücü + ", Savunma: " + savunmaGücü + ")");
        } else {
            System.out.println("⚔️ Savaş berabere bitti! (Saldırı: " + saldırıGücü + ", Savunma: " + savunmaGücü + ")");
        }
    }
}
