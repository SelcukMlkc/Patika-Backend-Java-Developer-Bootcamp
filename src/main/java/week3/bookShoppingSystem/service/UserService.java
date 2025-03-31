package week3.bookShoppingSystem.service;

import week3.bookShoppingSystem.model.User;

import java.util.HashSet;
import java.util.Set;

public class UserService {

    private Set<User> users = new HashSet<>();

    public void create(String name, String email, String password) {

        User user = new User(name, email, password);

        users.add(user);

    }

    public void list() {

        for (User user : users) {

            System.out.println(user.getName() + " -> " + user.getEmail());
        }
    }

    public User findUserByName(String userName) {

        User foundUser = null;

        for (User user : users) {
            if (user.getName().equals(userName)) {
                foundUser = user;
                break;

            }
        }
        return foundUser;

    }


    public User findUserByEmail(String email) {
        User foundUser = null;

        for (User user : users) {
            if (user.getEmail().equals(email)) {
                foundUser = user;
                break;

            }
        }
        return foundUser;
    }
}
