package week2.technicalContent4.inheritance2;

public class AccountTest {

    public static void main(String[] args) {

        //Account account = new Account();  // abstract olandan instantated oluşturamazsın

        SavingAccount savingAccount = new SavingAccount(500, 20000);
        savingAccount.setInterestRate(20000);

        InvestingAccount investingAccount = new InvestingAccount(5000);
    }
}
