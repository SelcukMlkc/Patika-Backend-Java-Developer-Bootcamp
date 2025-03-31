package week3.bookShoppingSystem.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Book extends Product{

    private Author author;

    private LocalDate publishedDate;

    private LocalDateTime createdDate;



    public Book(String name, double price, Author author, LocalDate publishedDate) {
        super(name, price);
        this.author = author;
        this.publishedDate = publishedDate;
        this.createdDate = LocalDateTime.now();

        //this.createdDate = LocalDateTime.now(); neden böyle yazıldı?
        //çünkü: createdDate alanı, kitap oluşturulduğu anda otomatik olarak sistemin o anki tarih ve saatini almalıdır.
        //this.createdDate = createdDate;
        //Böyle yazarsan, dışarıdan bir createdDate parametresi alman gerekir. Ama sen Book constructor'ında böyle bir parametre tanımlamadın:

    }

    public Author getAuthor() {
        return author;
    }

    public LocalDate getPublishedDate() {
        return publishedDate;
    }

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }


    @Override
    public String toString() {
        return "Book{" +
                "name=" + getName() +
                ", price=" + getPrice() +
                ", author=" + author +
                ", publishedDate=" + publishedDate +
                ", createdDate=" + createdDate +
                '}';
    }
}
