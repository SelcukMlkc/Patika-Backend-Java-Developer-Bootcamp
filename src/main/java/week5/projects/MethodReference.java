package week5.projects;

import java.util.ArrayList;
import java.util.List;

public class MethodReference {

    public static void main(String[] args) {

        //Instance method reference (class name)
        // Create a list of names
        List<String> names = new ArrayList<>();

        names.add("Ahmet");
        names.add("Ayşe");
        names.add("Mehmet");
        names.add("Zeynep");

        // Use method reference to print each name in the list
        names.forEach(System.out::println);
    }
}
