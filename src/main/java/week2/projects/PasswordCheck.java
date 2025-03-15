package week2.projects;

import java.util.Scanner;

public class PasswordCheck {

    public static void main(String[] args) {

        //Kullanıcıdan aldığınız şifreninin geçerli olup olmadığını aşağıdaki kurallara göre kontrol ederek "Geçerli Şifre" ya da "Geçersiz Şifre" şeklinde dönen kodu yazınız.
        //  1-En az 8 karakter içermeli
        //  2-Space karakteri içermemeli
        //  3-İlk harf büyük harf olmalı,
        //  4-Son karakteri ? olmalı

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen bir şifre oluşturunuz : ");
        String password = scanner.next();

        if(password.length()<8 || password.contains(" ") || !Character.isUpperCase(password.charAt(0)) || !password.endsWith("?")){
            System.out.println("Geçersiz şifre");
        }
        else{
            System.out.println("Geçerli şifre");
        }
        scanner.close();
    }
}
