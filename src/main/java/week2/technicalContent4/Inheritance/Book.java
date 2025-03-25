package week2.technicalContent4.Inheritance;

public class Book extends Product{

    private String author;

   /* public Book() {
// süper class ında yani product içerisinde boş bir constructor olmadığı için buraya  ekleyemezsin

    }  */


    public Book(String name, Double price) {
        super(name, price);
    }

    public Book(String name) {
        super(name);
    }
}
