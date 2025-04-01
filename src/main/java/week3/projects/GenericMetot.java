package week3.projects;

public class GenericMetot {

    public static <T> void printArray(T[]array) {

        for (T element: array) {
            System.out.print(element + " ");
        }
        System.out.println();  //  // Satır atlatır
    }

    public static void main(String[] args) {


        String[] strArray = {"Java", "Generics", "Ödev"};
        Integer[] intArray = {1, 2, 3, 4, 5};

        GenericMetot.printArray(strArray); // String
        GenericMetot.printArray(intArray);    // Integer

    }
}

