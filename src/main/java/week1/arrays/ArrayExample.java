package week1.arrays;

public class ArrayExample {

    public static void main(String[] args) {

        int[] numbers = {1, 5, 9, 256, 23, 56, 97};

        int max = numbers[0];  // burada max sayı için istediğini seçebilirdin farketmez

        for (int number : numbers) {

            if (number > max) {
                max = number;
            }
        }
            System.out.println("Dizideki en büyük eleman = " + max);

    }


}
