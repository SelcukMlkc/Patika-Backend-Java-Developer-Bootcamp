package week3;

import javax.print.attribute.standard.MediaSize;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetTest {

    public static void main(String[] args) {

        Set<String> fruits = new HashSet<>();

        fruits.add("Apple"); //63476538
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Apple");
        fruits.add(null);

        //tekrar etmiyor, 1 kere yazıyor.

        System.out.println("Apple kelimesinin hashCode karşılığı : " + "Apple".hashCode());

        System.out.println("Fruits : " + fruits);  //sıralama garantisi yok. rastgele yazıyor HashSet

        //linkedHashSet

        LinkedHashSet<String> cities = new LinkedHashSet<>();

        cities.add("İstanbul");
        cities.add("Ankara");
        cities.add("İzmir");
        cities.add("İstanbul");

        System.out.println("Cities : " + cities); // 1 kere yazıyor ve sırayla yazıyor linkedHashSet

        //TreeSet > sıralama yapabiliyor

        Set<Integer> numbers = new TreeSet<>();

        numbers.add(10);
        numbers.add(5);
        numbers.add(20);
        numbers.add(15);

        System.out.println("Numbers: " + numbers);

        Set<String> cars = new TreeSet<>();

        cars.add("BMW");
        cars.add("Mercedes");
        cars.add("Audi");

        System.out.println("Cars: " + cars);

        cars.remove("Audi");

        System.out.println("Cars: " + cars);

        System.out.println("Size: " + cars.size());

        cars.clear();

        System.out.println("Cars: " + cars);

        System.out.println(cars.isEmpty());





    }
}
