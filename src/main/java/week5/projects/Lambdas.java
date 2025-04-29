package week5.projects;

import java.util.ArrayList;
import java.util.List;

public class Lambdas {

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        // Sayıları iki katına çıkarma (Lambda ile)
        numbers.replaceAll(number -> number * 2);

        // Sonuçları yazdırma (Lambda ile)
        numbers.forEach(number -> System.out.println(number));
    }
}
