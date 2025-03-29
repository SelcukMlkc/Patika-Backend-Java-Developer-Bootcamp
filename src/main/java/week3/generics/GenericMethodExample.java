package week3.generics;

public class GenericMethodExample {

    public static <T> void printArray(T[]array) {

        for (T element: array) {
            System.out.println(element);
        }
    }
}
