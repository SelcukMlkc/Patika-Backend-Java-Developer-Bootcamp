package week1.arrays;

import java.util.Arrays;

public class ArrayExample {

    public static void main(String[] args) {

        int[] numbers = {1, 5, 9, 256, 23, 56, 97};

        int max = numbers[0];  // burada max sayı için istediğini seçebilirdin farketmez

        for (int number : numbers) {   //bu for each döngüsü. numbers daki her elemanın sırayla number a atıyor

            if (number > max) {
                max = number;
            }
            System.out.println(number);
        }
            System.out.println("Dizideki en büyük eleman = " + max);
        System.out.println(Arrays.toString(numbers));   // Dizileri bu şekilde yazdırabilirisin

        System.out.println(numbers[1]);

        //eğer ben diziyi küçükten büyüğe sıralı yazmak istersem;

        Arrays.sort(numbers);
        System.out.println("Sıralı dizi = " + Arrays.toString(numbers));



    }


}
