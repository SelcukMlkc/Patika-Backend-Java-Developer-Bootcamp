package week3.bookShoppingSystem;

import week3.bookShoppingSystem.model.Author;
import week3.bookShoppingSystem.model.Product;
import week3.bookShoppingSystem.model.User;
import week3.bookShoppingSystem.model.enums.Gender;
import week3.bookShoppingSystem.service.AuthorService;
import week3.bookShoppingSystem.service.OrderService;
import week3.bookShoppingSystem.service.ProductService;
import week3.bookShoppingSystem.service.UserService;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class PatikaBooks {

    public static void main(String[] args) {

        UserService userService = new UserService();

        userService.create("Cem", "cempatika.com", "password");
        userService.create("Ayşe", "aysepatika.com", "password1");
        userService.create("Fatma", "fatmapatika.com", "password2");
        userService.list();  //list metodunu çalıştırdık, userservice içinde

        AuthorService authorService = new AuthorService();
        authorService.create("patika", "patika", Gender.WOMEN);
        Author author = authorService.findAuthor("patika");

        ProductService productService = new ProductService();
        productService.create("Java Programlama", 155, author, LocalDate.of(2022,1,1));
        productService.create("Java Programlama1", 255, author, LocalDate.of(2023,1,1));
        productService.create("Java Programlama2", 355, author, LocalDate.of(2024,1,1));


        productService.create("Aylık Patika Dergisi", 400);


        productService.list();


        // ---------------

        Product product = productService.findProductByName("Java Programlama2");
        Product product1 = productService.findProductByName("Java Programlama1");
        User user = userService.findUserByName("Fatma");

        OrderService orderService = new OrderService();

            orderService.create(List.of(product, product1), user);

            orderService.list();



            //-----------


        Scanner scanner = new Scanner(System.in);


        while (true) {

            System.out.println("1. Müşteri Kaydı");
            System.out.println("2. Sipariş Ver");
            System.out.println("3. Siparişlerimi Görüntüle");
            System.out.println("4. Ürünleri Görüntüle");
            System.out.println("5. Çıkış");

            int choise = scanner.nextInt();

            switch (choise) {

                case 1:
                    System.out.println("Müşteri ismini girin: ");
                    String name = scanner.nextLine();
                    System.out.println("Müşteri email adresini girin: ");
                    String email = scanner.nextLine();
                    System.out.println("Müşteri şifresini giriniz: ");
                    String password = scanner.nextLine();

                    userService.create(name, email, password);
                    break;

                case 2:
                    System.out.println("Müşteri email adresini girin: ");
                    String givenEmail = scanner.nextLine();
                    User foundUser = userService.findUserByEmail(givenEmail);
                    System.out.println("Ürün ismini giriniz: ");
                    String productName = scanner.nextLine();
                    Product foundProduct = productService.findProductByName(productName);
                    orderService.create(List.of(foundProduct), foundUser);
                    break;


                case 3:
                    System.out.println("Çıkış yapılıyor...");
                    scanner.close();
                    return;


                default:
                    System.out.println("Geçersiz bir işlem!");



            }
        }





    }
}
