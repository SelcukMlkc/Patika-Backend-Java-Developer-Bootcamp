package week3.map;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapTest {

    public static void main(String[] args) {

        Map<String, String> countries  = new LinkedHashMap<>();

        countries.put("TR", "TÜRKİYE");
        countries.put("US", "UNITED STATES");
        countries.put("DE", "GERMANY");

        System.out.println("Countries: " + countries);

        countries.remove("DE");
        countries.put("FR", "FRANCE");

        System.out.println("Countries: " + countries);

    }
}
