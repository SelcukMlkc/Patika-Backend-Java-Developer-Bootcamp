package week3.projects;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Finding2ClosestNumbers {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        List<Integer> numbersList = new ArrayList<>();

        numbersList.add(5);
        numbersList.add(20);
        numbersList.add(12);
        numbersList.add(37);
        numbersList.add(61);
        numbersList.add(88);
        numbersList.add(43);
        numbersList.add(99);
        numbersList.add(27);
        numbersList.add(44);

        Collections.sort(numbersList);   //küçükten büyüğe sıraladık

        System.out.println("Listemdeki Sayılar: " + numbersList);

        // En küçük farkı bulmak için bir değişken tanımlıyoruz
        int minDifference =  Collections.max(numbersList);;
        int num1 = 0, num2 = 0;

        // Komşu elemanlar arasındaki farkı buluyoruz
        for (int i = 0; i < numbersList.size() - 1; i++) {
            int difference = numbersList.get(i + 1) - numbersList.get(i);

            if (difference < minDifference) {
                minDifference = difference;
                num1 = numbersList.get(i);
                num2 = numbersList.get(i + 1);
            }
        }

        // 4️⃣ Sonucu yazdırıyoruz
        System.out.println("Birbirine en yakın iki sayı: " + num1 + " ve " + num2);
        System.out.println("Farkları: " + minDifference);
    }
}
