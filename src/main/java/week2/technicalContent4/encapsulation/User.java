package week2.technicalContent4.encapsulation;

public class User {

    private String usurName;

    private String password;

    public User(String usurName, String password) {
        setUsurName(usurName);
        setPassword(password);
    }

    public String getUsurName() {
        return usurName;
    }

    private void setUsurName(String usurName) {
        if (usurName.length() >= 3 && usurName.length() <= 15) {
            this.usurName = usurName;
        } else {
            System.out.println("Lütfen en az 3 en fazla 15 haneli bir kullanıcı adı giriniz.");
        }
    }

    public String getPassword() {
        return password;
    }

    private void setPassword(String password) {
        if(password.length() >=8 && password.length() <=11) {
        this.password = password;
        } else {
            System.out.println("Şifre en az 8 en fazla 11 haneli olabilir.");
        }

    }
}
