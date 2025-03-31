package week3.bookShoppingSystem.service;

import week3.bookShoppingSystem.model.Author;
import week3.bookShoppingSystem.model.enums.Gender;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AuthorService {

    //private static List<Author> authors = new ArrayList<>();
    private static Map<String, Author> authors = new HashMap();


    public void create(String name, String surname, Gender gender) {

        Author author = new Author(name, surname, gender);
        authors.put(author.getName(), author);
    }

    public Author findAuthor(String name) {

        return authors.get(name);


    }
}
