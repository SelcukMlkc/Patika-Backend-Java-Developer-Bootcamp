package week5.streams;

import java.util.List;
import java.util.Optional;

public class OptionalExample {

    public static void main(String[] args) {

        String name = null;
        String name1 = "Patika";

        Book book = null;

        System.out.println(name1.length());

        //System.out.println(book.getName());

        Optional<String> stringOptional = Optional.of("Patika.dev");

        System.out.println(stringOptional.get());

        Optional<String> optionalName = Optional.ofNullable(name);
        System.out.println(optionalName.isPresent());

        Optional<String> optionalName1 = Optional.ofNullable(name1);
        System.out.println(optionalName1.isPresent());

        Optional<String> emptyOptional =Optional.empty();
        System.out.println(emptyOptional.isPresent());

        //--------

        Optional<String> stringOptional1 = Optional.ofNullable("Patika.dev");

        if(stringOptional1.isPresent()){
            System.out.println("Değer var! " + stringOptional1.get());
        } else {
            System.out.println("Değer yok");
        }

        if(emptyOptional.isPresent()) {
            System.out.println("Değer var! " + emptyOptional.get());
        } else {
            System.out.println("Değer yok");
        }

        stringOptional1.ifPresent(name2 -> System.out.println("Değer var " + name2) );

        //orElse


        String result = Optional.ofNullable(name).orElse("Bilinmeyen kullanıcı");
        System.out.println(result);

        //
        String result1 = Optional.ofNullable(name).orElseGet(() -> "Bilinmeyen kullanıcı");
        System.out.println(result1);


        //String result2 = Optional.ofNullable(name).orElseThrow(() -> new IllegalArgumentException("Kullanıcı Bulanamadı"));

        //

        List<String> names = List.of("Mehmet", "Ayşe", "Veli", "Ali", "Ahmet");

        Optional<String> ahmet = names.stream()
                .filter(name3 -> name3.startsWith("A"))
                .findAny();

        System.out.println(ahmet.get());


        Optional<String> ahmet1 = names.stream()
                .filter(name3 -> name3.startsWith("A"))
                .findFirst();

        System.out.println(ahmet1.get());

        List<Integer> list = names.stream()
                .map(String::length)
                .toList();

        System.out.println(list);




    }
}
