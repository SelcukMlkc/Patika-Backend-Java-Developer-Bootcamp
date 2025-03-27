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
            printMenu();

            choise = scanner.nextInt();

            switch (choise) {

                case 1:
                    createBankAccount(scanner);
                    break;

                case 2:
                    customers[0].listAccounts();
                    break;

                case 3:
                    customers[0].listAccounts();
                    System.out.println("İşlem yapmak istediğiniz hesabı seçiniz: ");
                    int selectedIndex = scanner.nextInt();
                    BankAccount selectedBankAccount = customers[0].getBankAccounts()[selectedIndex];

                    int subChoise;

                    do {
                        System.out.println("----" + selectedBankAccount.getAccountNumber() + " hesabı için işlem yapıyorsunuz!");
                        System.out.println("1 - Bakiye görüntüle");
                        System.out.println("2 - Para Yatır");
                        System.out.println("3 - Para Çek");
                        System.out.println("4 - Ana Menüye Dön");

                        subChoise = scanner.nextInt();

                        switch (subChoise) {

                            case 1:
                                System.out.println(selectedBankAccount.getAccountNumber() + " hesabında " + selectedBankAccount.getBalance() + selectedBankAccount.getCurrencyType().getSymbol() + " bakiye bulunmaktadır");
                                selectedBankAccount.getBalance();
                                break;

                            case 2:
                                System.out.print("Yatırmak istediğiniz miktarı giriniz: ");
                                double amount = scanner.nextDouble();
                                selectedBankAccount.deposit(amount);
                                break;

                            case 3:
                                System.out.print("Çekmek istediğiniz miktarı giriniz: ");
                                double drawAmount = scanner.nextDouble();
                                selectedBankAccount.withDraw(drawAmount);
                                break;

                            case 4:
                                System.out.println("Ana menüye aktarılıyorsunuz...");
                                break;

                            default:
                                System.out.println("Yanlış seçim yaptınız!");
                        }

                    } while (subChoise != 4);
                        break;


                case 4:
                    System.out.println("Çıkış yapılıyor...");
                    break;

                default:
                    System.out.println("Geçersiz seçim yaptınız!");
            }

        } while (choise != 0);

        System.out.println("Bankamızı Seçtiğiniz İçin Teşekkürler");

    }

    private static void printMenu() {
        System.out.println("-------Bankacılık İşlemleri-------");
        System.out.println("1 - Yeni hesap aç");
        System.out.println("2 - Hesaplarını listele");
        System.out.println("3 - Hesap seç ve işlem yap");
        System.out.println("4 - Çıkış yap");
        System.out.print("Seçiminizi yapınız");
    }

    private static void createBankAccount(Scanner scanner) {
        System.out.println("Başlangıç bakiyesi girin: ");
        double amount = scanner.nextDouble();
        System.out.println("Para birimi seçiniz: 1 - TL / 2 - Dolar / 3 - Euro / 4 - Altın");
        int currencyChoise = scanner.nextInt();

        CurrencyType currencyType = switch (currencyChoise) {
            case 1 -> CurrencyType.TL;
            case 2 -> CurrencyType.DOLAR;
            case 3 -> CurrencyType.EURO;
            case 4 -> CurrencyType.GOLD;
            //Switch Expression (->): Java 14 ile gelen yeni switch sözdizimi kullanılıyor. Klasik case ifadelerindeki break; yerine -> kullanılıyor.
            default -> {
                System.out.println("Geçesiz birim seçtiniz!");
                yield CurrencyType.TL;
                // yield Anahtar Kelimesi: default durumunda geçerli bir değer döndürmek için kullanılıyor.
            }
        };

        String customerName = customers[0].getName();
        String accountNumber = customerName.charAt(0) + " - " + customerName.length() + currencyChoise;

        BankAccount bankAccount = new BankAccount(accountNumber, amount, currencyType);

        customers[0].addAccount(bankAccount);
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
            } else {
                System.out.println("Doğru şifre girdiniz. Bankacılık menüsüne aktarılıyorsunuz:");
                break;
            }
        }while (wrongPasswordCounter < 4);
    }
}
