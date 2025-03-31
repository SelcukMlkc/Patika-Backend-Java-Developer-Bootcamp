package week3.bookShoppingSystem.model;

import week3.bookShoppingSystem.model.enums.Gender;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class User {

    private String name;

    private String email;

    private String password;

    private Gender gender;  //gender:cinsiyet

    private LocalDate birthDay;

    private LocalDate createdDate;

    private  Boolean isActive;

    private List<Order> orderList = new ArrayList<>();


    public User(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.createdDate =LocalDate.now();
        this.isActive = true;
    }


    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public Gender getGender() {
        return gender;
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public LocalDate getCreatedDate() {
        return createdDate;
    }

    public Boolean getActive() {
        return isActive;
    }

    public List<Order> getOrderList() {
        return orderList;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", gender=" + gender +
                ", birthDay=" + birthDay +
                ", createdDate=" + createdDate +
                ", isActive=" + isActive +
                ", orderList=" + orderList +
                '}';
    }
}
