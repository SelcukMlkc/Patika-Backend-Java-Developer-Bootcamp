package hafta1.JavaEgıtımı;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ArtıkYılHesaplama {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Yıl Giriniz :");
        int Yıl = scanner.nextInt();

        int Sonuç = Yıl % 4 ;
        int X = Yıl % 100 ;
        int Y = Yıl % 400 ;

        if (X == 0 && Y != 0) {
            System.out.println(Yıl + " bir artık yıl değildir !");
            return;
        }


        if (Sonuç == 0) {
            System.out.println(Yıl + " bir artık yıldır !");
        }
        else{
            System.out.println(Yıl + " bir artık yıldır değildir!");
        }



    }
}
