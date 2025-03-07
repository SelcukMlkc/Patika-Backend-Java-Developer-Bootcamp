package hafta1.Döngüler;

import java.util.Scanner;

public class LoopsDoWhile2 {
    public static void main(String[] args) {

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
                //break;

            } else {
                System.out.println("Yanlış bir şifre girdiniz.");
                counter++;
            }

        } while (isPasswordFalse = false || counter < 3);

    }
}


