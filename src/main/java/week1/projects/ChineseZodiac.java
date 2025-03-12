package week1.projects;

import java.util.Scanner;

public class ChineseZodiac {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Doğum Yılınızı Giriniz :");
        int Yıl = scanner.nextInt();

        int Sonuc = Yıl % 12 ;

        switch (Sonuc) {
            case 0:
                System.out.println("Çin Zodyağı Burcunuz :" + " Maymun");
                break;
            case 1:
                System.out.println("Çin Zodyağı Burcunuz :" + " Horoz");
                break;
            case 2:
                System.out.println("Çin Zodyağı Burcunuz :" + " Köpek");
                break;
            case 3:
                System.out.println("Çin Zodyağı Burcunuz :" + " Domuz");
                break;
            case 4:
                System.out.println("Çin Zodyağı Burcunuz :" + " Fare");
                break;
            case 5:
                System.out.println("Çin Zodyağı Burcunuz :" + " Öküz");
                break;
            case 6:
                System.out.println("Çin Zodyağı Burcunuz :" + " Kaplan");
                break;
            case 7:
                System.out.println("Çin Zodyağı Burcunuz :" + " Tavşan");
                break;
            case 8:
                System.out.println("Çin Zodyağı Burcunuz :" + " Ejderha");
                break;
            case 9:
                System.out.println("Çin Zodyağı Burcunuz :" + " Yılan");
                break;
            case 10:
                System.out.println("Çin Zodyağı Burcunuz :" + " At");
                break;
            case 11:
                System.out.println("Çin Zodyağı Burcunuz :" + " Koyun");


        }






    }
}


/* kısa yöntem:
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan doğum yılını al
        System.out.print("Doğum Yılınızı Giriniz: ");
        int dogumYili = scanner.nextInt();

        // Çin Zodyağı burcunu hesaplamak için doğum yılını 12'ye bölerek kalanını buluyoruz
        int kalan = dogumYili % 12;

        // Çin Zodyağı burcunu belirleme
        String burc = "";
        switch (kalan) {
            case 0: burc = "Maymun"; break;
            case 1: burc = "Horoz"; break;
            case 2: burc = "Köpek"; break;
            case 3: burc = "Domuz"; break;
            case 4: burc = "Fare"; break;
            case 5: burc = "Öküz"; break;
            case 6: burc = "Kaplan"; break;
            case 7: burc = "Tavşan"; break;
            case 8: burc = "Ejderha"; break;
            case 9: burc = "Yılan"; break;
            case 10: burc = "At"; break;
            case 11: burc = "Koyun"; break;
            default: burc = "Hatalı giriş";
        }

        // Sonucu ekrana yazdır
        System.out.println("Çin Zodyağı Burcunuz: " + burc);

        scanner.close();
    }
}
 */