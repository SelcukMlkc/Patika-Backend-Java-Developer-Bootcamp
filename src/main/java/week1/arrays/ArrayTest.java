package week1.arrays;

public class ArrayTest {

    public static void main(String[] args) {

        int number = 5;
        int number1 = 10;
        int number2 = 15;

        //şimdi bunu array ile yazıcaz

        int[] numbers = new int[5]; // eleman sayısı
        numbers[0] = 5;
        numbers[1] = 10;
        numbers[2] = 15;
        numbers[3] = 20;
        numbers[4] = 25;


        //numbers[5] = 30;  array index out of bound hatası
        // numbers.length ile dizinin kapasitesini(elman sayısını girersin

        for (int i = 0; i < numbers.length ; i++) {
            System.out.println("number[" + i + "] =" + numbers[i]);
            // System.out.println(numbers.length); bunu yazarsan çıktı olarak 5 alırsın.

        }

        // System.out.println("number[" + 5 + "] =" + numbers[5]);  array index out of bound hatası

        // bu da 2. yöntemm;

        int[] numbers2 = {1, 2, 3, 4, 5};
        // int numbers2[] = {1, 2, 3, 4, 5}; bunu bu şekilde de yazabilirsin bu da geçerli ama üstdeki daha iyi

        // numbers[0] = 7; yaparak dizi elemanlarını değiştirebilirsin

        for (int num : numbers2) {
            System.out.println(num);
        }

        // String[] cities = newString[] {"İstanbul", "Ankara", "İzmir", "Bursa", "Sinop"} Değerler belli old. için newString[] yazmaya gerek yok.
        String[] cities = {"İstanbul", "Ankara", "İzmir", "Bursa", "Sinop"};

        for (String city : cities) {
            System.out.println(city);
        }


    }
}
