package week3.map;

import java.util.TreeMap;

public class TreeMapTest {

    public static void main(String[] args) {

        TreeMap<Integer, String> numbers = new TreeMap<>();

        numbers.put(3, "Üç");
        numbers.put(1, "Bir");
        numbers.put(2, "İki");

        System.out.println("Numbers: " + numbers);

        System.out.println("First Key: " + numbers.firstKey());

        System.out.println("Last Key: " + numbers.lastKey());

        System.out.println(numbers.containsKey(4));




    }
}
