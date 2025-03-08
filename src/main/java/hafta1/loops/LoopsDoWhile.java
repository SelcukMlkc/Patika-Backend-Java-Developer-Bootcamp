package hafta1.loops;

import java.util.Scanner;

public class LoopsDoWhile {

    public static void main(String[] args) {

        /* while ( 1 == 1) {
        // while'ın içi true, eğer false olursa hata veriyor

             System.out.println("Sonsuz döngü devam ediyor");
         } */


        /*int i = 0;
        while (i < 10) {
            System.out.println(i);

            i++;
        }

        // do olduğunda false olsa bile en az 1 kere çalışıyor. Aşağıdaki örnekte olduğu gibi
        do {

            System.out.println("Bu döngü en az 1 kere çalışır.");

        }
        while ( 0 > 1); */

        Scanner scanner = new Scanner(System.in);

        String password = "1234";

        boolean isPasswordFalse = true;

        int counter = 0;

        do {

            System.out.println("Şifre giriniz: ");

            String input = scanner.nextLine();

            // if(password == input) { (Burada bunu kullanamam çünkü bu operatör stringlerde çalışmıyor. Bu yüzden equals kullanmalıyım.
            if (password.equals(input)) {

                System.out.println("Doğru bir şifre girdiniz.");
                isPasswordFalse = false;

            } else {
                System.out.println("Yanlış bir şifre girdiniz.");
                isPasswordFalse = true;
            }

        } while (isPasswordFalse);


    }
}