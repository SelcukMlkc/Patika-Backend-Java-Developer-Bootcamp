package week3.generics;

import java.util.ArrayList;
import java.util.List;

public class WildcardsExample {

    public static void main(String[] args) {

        List<Integer> integerList = List.of(1,2,3);
        List<String> stringList =List.of("Java", "Ptyon");

        print(integerList);
        print(stringList);


    }

    private static void print(List<?> list) {

        for (Object object : list) {

            System.out.println(object);
        }
    }
}
