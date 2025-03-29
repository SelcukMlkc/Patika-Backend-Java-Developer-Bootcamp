package week3.collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class BookSetTest2 {

    public static void main(String[] args) {

        Set<BookSetTest> bookSet = new HashSet<>();

    BookSetTest book1 = new BookSetTest("Clean Code", "Robert C. Martin");

    BookSetTest book2 = new BookSetTest("Effective Java", "Joshua Bloch");

    BookSetTest book3 = new BookSetTest("Clean Code", "Robert C. Martin");

    bookSet.add(book1);
    bookSet.add(book2);
    bookSet.add(book3);


        System.out.println(book1.hashCode()); // -1425224273
        System.out.println(book2.hashCode()); // -638148554
        System.out.println(book3.hashCode());  // -1425224273

        System.out.println("Kütüphanemdeki kitaplar: " + bookSet);
        System.out.println("Kütüphanemde " + bookSet.size() + " adet kitap var." );  // ikisi aynı olduğu için 2 kabul ediyor


        // TreeSet

        System.out.println("----TreeSet------");


        Set<BookSetTest> bookTreeSet = new TreeSet<>();

        bookTreeSet.add(book1);
        bookTreeSet.add(book2);
        bookTreeSet.add(book3);

        System.out.println("Kütüphanem: " + bookTreeSet);

        //Başta hata aldın çünkü sıralama karşılaştırma yapılarak yapılıyor. Karmaşık bir yapı olduğundan karşılaştıramıyor









    }
}
