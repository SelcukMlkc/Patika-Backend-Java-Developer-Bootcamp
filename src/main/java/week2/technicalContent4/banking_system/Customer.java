package week2.technicalContent4.banking_system;

public class Customer {

    private String name;

    private String surname;

    private String phone;

    private String password;

    private String identity;

    private BankAccount[] bankAccounts;

    private int bankAccountCounter = 0;


    public Customer(String name, String surname, String password, String identity) {

        if(password.length() < 8 && password.length() >= 12) {

            System.out.println("Şifreniz en az 8 en fazla 12 haneli olmalıdır!");
        } else {
        this.name = name;
        this.surname = surname;
        this.password = password;
        this.identity = identity;
        bankAccounts = new BankAccount[4];

            System.out.println("Kullanıcı oluşturuldu. " + this);
    }
    }

    public void addAccount(BankAccount bankAccount) {

        if (bankAccountCounter < bankAccounts.length) {

            bankAccounts[bankAccountCounter] = bankAccount;
            bankAccountCounter++;
            System.out.println("Yeni hesap eklendi: " + bankAccount.getAccountNumber());
        } else {
            System.out.println("Maksimum hesap limitine ulaşıldı!");
        }

    }

    public void listAccounts() {

        System.out.println(getName() + " adlı kullanıcının hesapları: ");

        for (BankAccount bankAccount : bankAccounts) {

            System.out.println(bankAccount);
        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public BankAccount[] getBankAccounts() {
        return bankAccounts;
    }



    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
