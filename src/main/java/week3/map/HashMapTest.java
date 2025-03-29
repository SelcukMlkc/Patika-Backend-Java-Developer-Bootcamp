package week3.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {

    public static void main(String[] args) {

        Map<String, Integer> students = new HashMap<>();  //birincisi key, ikincisi value

        students.put("Ali", 85);
        students.put("Ayşe", 90);
        students.put("Emir", 75);

        System.out.println("Students: " + students);

        System.out.println("Ayşe'nin notu: " + students.get("Ayşe"));

        System.out.println("Keys: " + students.keySet());

        System.out.println("Values: " + students.values());

        students.remove("Cem");

        System.out.println(students);  // cem olmadığı için silemedi

        students.put("Cem", 70);

        System.out.println(students);

        students.remove("Cem");

        System.out.println(students);


    }
}
