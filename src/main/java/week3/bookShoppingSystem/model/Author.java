package week3.bookShoppingSystem.model;

import week3.bookShoppingSystem.model.enums.Gender;

import java.time.LocalDate;

public class Author {

    private String name;

    private String surname;

    private Gender gender;

    private LocalDate birthday;

    private String bio;


    public Author(String name, String surname, Gender gender) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Gender getGender() {
        return gender;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public String getBio() {
        return bio;
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", gender=" + gender +
                ", birthday=" + birthday +
                ", bio='" + bio + '\'' +
                '}';
    }
}
