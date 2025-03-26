package week2.technicalContent4.banking_system;

public class BankAccount {

    private String accountNumber;
    private double balance;
    private CurrencyType currencyType;

    public BankAccount(String accountNumber, double balance, CurrencyType currencyType) {

        if (balance < 0){
            System.out.println("Eksi bakiye ile hesap oluşturamazsınız!");

        }
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.currencyType = currencyType;
    }

    public void deposit(double amount){
        if (amount > 0) {
            balance += amount;
            System.out.println(amount + " " + currencyType.getSymbol() + " yatırıldı. Yeni bakiyeniz = " + balance + " " + currencyType.getSymbol());

        } else {
            System.out.println("Geçersiz tutar!");
        }

    }
}
