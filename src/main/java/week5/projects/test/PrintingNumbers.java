package week5.projects.test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class PrintingNumbers {

    public static void main(String[] args) {

        List<Integer> numbers =  Arrays.asList(1,2,3,4,5);

        List<Integer> doubledNumbers = numbers.stream() // akış başlatıyor.
                .map(n -> n * 2) //Her elemanı 2 ile çarpıyor.
                .toList(); //Çıkan sonuçları listeye topluyor.

        doubledNumbers.forEach(System.out::println); //Her elemanı ekrana yazdırma.


    }
}
