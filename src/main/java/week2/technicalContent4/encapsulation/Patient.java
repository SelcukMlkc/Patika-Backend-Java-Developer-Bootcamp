package week2.technicalContent4.encapsulation;

public class Patient {

    String identityNumber;   //private olanı default bıraktım

    private String name;

    private String surname;

    private int age;

    /*public Patient() {
    } */

    public Patient(String identityNumber) {  //Constructor, bir sınıfın ismiyle aynı olan, geri dönüş tipi olmayan özel bir metottur.
        setIdentityNumber(identityNumber);
    }

    public String getIdentityNumber() {
        return identityNumber;
    }

    public void setIdentityNumber(String identityNumber) {
        if(identityNumber.length() != 11) {
            System.out.println("11 haneden başka TCKN giremezsiniz!");
        } else {
            this.identityNumber = identityNumber;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
