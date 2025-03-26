package week2.technicalContent4.banking_system;

import java.util.Scanner;

public class BankingSystem {

    private static  Customer[] customers = new Customer[10];

    public static void main(String[] args) {


        Customer customer = new Customer("Elif" , "Ak" , "12345678" , "437265382");

        customers[0] = customer;
        menu();
    }

    private static void menu(){

        Scanner scanner = new Scanner(System.in);

        validatepassword();

        int choise;

        do {
            System.out.println("-------Bankacılık İşlemleri-------");
            System.out.println("1 - Yeni hesap aç");
            System.out.println("2 - Hesaplarını listele");
            System.out.println("3 - Hesap seç ve işlem yap");
            System.out.println("4 - Çıkış yap");
            System.out.print("Seçiminizi yapınız");

            choise = scanner.nextInt();

            switch (choise) {

                case 1:
                    BankAccount bankAccount = new BankAccount();
            }

        } while (1 == 1);

    }



    private static void validatepassword() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Merhaba " + customers[0].getName());

        int wrongPasswordCounter = 0;

        do {

            System.out.println("Şifrenizi giriniz: ");
            String password = scanner.nextLine();

            if (!customers[0].getPassword().equals(password)) {
                System.out.println("Yanlış şifre giriniz!");
                wrongPasswordCounter++;
            }
        }while (wrongPasswordCounter < 4);
    }
}
