package week1.loops;

import java.util.Scanner;

public class WhilePassword {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String customerPassword = "12345";
        boolean passwordSuccessfull = false;

        while (!passwordSuccessfull) {

            System.out.println("Hesap şifrenizi giriniz:");
            String typedPassword = scanner.next();

            if (customerPassword.contentEquals(typedPassword)) {
                passwordSuccessfull = true;
                System.out.println("Sisteme başarılı giriş yaptınız!");
            }  else {
            System.out.println("Yanlış şifre girdiniz!"); // Sadece yanlış şifre girildiğinde yazdırılacak
        }
        }
    }
}
