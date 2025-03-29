package week3.map;

import java.util.HashMap;
import java.util.Map;

public class BookMapExample {

    public static void main(String[] args) {

        Map<String, Book> bookMap = new HashMap<>();

        bookMap.put("ISBN123", new Book("Clean Code", "Robert C. Martin"));
        bookMap.put("ISBN456", new Book("Effective Java", "Joshua Bloch"));

        for (Map.Entry<String, Book> entry : bookMap.entrySet()) {

            //1️Anlamı
            //bookMap.entrySet() → Map'teki tüm key-value çiftlerini döndürür.
            //
            //Map.Entry<String, Book> → Her key-value çiftini temsil eden bir nesnedir.
            //
            //entry → Döngü içinde her bir key-value çiftini temsil eden değişken.
            //
            //for-each → Bütün entrySet() içindeki elemanları tek tek dolaşır.

            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());


        }
    }
}
