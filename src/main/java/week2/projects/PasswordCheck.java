package week2.projects;

import java.util.Scanner;

public class PasswordCheck {

    public static void main(String[] args) {

        //Kullanıcıdan aldığınız şifreninin geçerli olup olmadığını aşağıdaki kurallara göre kontrol ederek "Geçerli Şifre" ya da "Geçersiz Şifre" şeklinde dönen kodu yazınız.
        //  1-En az 8 karakter içermeli
        //  2-Space karakteri içermemeli
        //  3-İlk harf büyük harf olmalı,
        //  4-Son karakteri ? olmalı

        String code = "Ankara06?";  //Sistemde kayıtlı olan şifreyi belirledim

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen şifreyi giriniz : ");
        String password = scanner.nextLine(); // Kullanıcıdan şifre aldık

        int length = password.length();

        if (length < 8 ) {
            System.out.println("Geçersiz Şifre! Şifre en az 8 karakter içermeli!");
        }

        else if (password.contains(" ")) {

            System.out.println("Geçersiz Şifre! Şifre space karakteri içermemeli!");
        }

        else if (!Character.isUpperCase(password.charAt(0))) {   //tek bir karakter için bu metodu kullanıyoruz

            System.out.println("Geçersiz Şifre! Şifre'nin İlk harf büyük harf olmalı!");
        }

        else if (!password.endsWith("?")) {

            System.out.println("Geçersiz Şifre! Şifre'nin son karakteri ? olmalı!");
        }

        else if (password.equals(code)) {

            System.out.println("Geçerli Şifre!");
        }
        else {
            System.out.println("Geçersiz Şifre!");
        }


    }
}
