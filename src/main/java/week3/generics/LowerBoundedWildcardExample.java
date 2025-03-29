package week3.generics;

import java.util.ArrayList;
import java.util.List;

public class LowerBoundedWildcardExample {

public static void add(List<? super Integer> list){  //extends'in tersi super. Yani Integer'ın bir üstü yani Number'dan yada Object'den oluşacak

    //✅ Liste, Integer veya onun üst sınıflarını (Number, Object) kabul eder.
    //❌ Liste, Integer'ın alt sınıflarını (Double, Float gibi) kabul etmez.

    list.add(1);
    list.add(2);


}

    public static void main(String[] args) {

    List<Number> numbers = new ArrayList<>();

    add(numbers);

    //add(numbers); çağrıldığında:
        //
        //numbers.add(1);
        //
        //numbers.add(2);

        System.out.println(numbers);

        List<Double> doubles = new ArrayList<>();

        // add(doubles);  hata alırsın. ınteger ın altı çünkü
    }
}
