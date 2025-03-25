package week2.technicalContent4.Inheritance;

public class Product {  //extends Object hiç eklemesenizde her zaman bu kalıtım gerçekleşir

    private String name;

    private Double price;

   /* public Product(){  // bu bir constructor
// defult constructor her zaman olur. Fakat yeni bir constructor oluşturursanız bu defult method gider.
    } */

    public Product(String name) {
        this.name= name;
    }

    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
