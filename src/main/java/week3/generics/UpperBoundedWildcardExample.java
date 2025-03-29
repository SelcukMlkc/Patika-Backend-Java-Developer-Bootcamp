package week3.generics;

import java.util.List;

public class UpperBoundedWildcardExample {

    public static double sum(List<? extends Number>list) {

        double sum = 0;

        for (Number number : list){
            sum += number.doubleValue();

        }
        return sum;
    }

    public static void main(String[] args) {

        List<Integer> integerList = List.of(1,2,3);
        List<Double> doublesList =List.of(1.5 , 2.5);

        System.out.println(sum(integerList));
        System.out.println(sum(doublesList));

        List<String> stringList =List.of("Java", "Ptyon");
        // sum(List<String> stringList =List.of("Java", "Ptyon");  //sum'ı number dan extends ettim. Bu yüzden string kabul etmiyor
    }
}
