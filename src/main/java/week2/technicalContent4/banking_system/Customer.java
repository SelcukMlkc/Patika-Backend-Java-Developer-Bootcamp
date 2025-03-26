package week2.technicalContent4.banking_system;

public class Customer {

    private String name;

    private String surname;

    private String phone;

    private String password;

    private String identity;

    private BankAccount[] bankAccounts;


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

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
