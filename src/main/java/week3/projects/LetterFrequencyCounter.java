package week3.projects;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LetterFrequencyCounter {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir kelime giriniz: ");
        String input = scanner.next();


        // Harf frekanslarını bul ve yazdır
        Map<Character, Integer> letterFrequencies = countLetterFrequency(input);

        printLetterFrequencies(letterFrequencies);  //Sonuçları ekrana yazdırma

        scanner.close();
    }

    // Harf frekanslarını hesaplayan metot
    public static Map<Character, Integer> countLetterFrequency(String input) {

        Map<Character, Integer> frequencyMap = new HashMap<>();

        // Girilen kelimeyi küçük harfe çevir (büyük/küçük harf farkı olmasın)
        input = input.toLowerCase();

        // Metindeki her karakteri işle
        for (char ch : input.toCharArray()) {  //Bununla metni char dizisine çevirdim
            if (Character.isLetter(ch)) { // Sadece harfleri dikkate al
                frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);  //Eğer harf daha önce eklenmemişse varsayılan 0 değerini alır ve 1 artırır.
            }
        }
        return frequencyMap;
    }

    // Harf frekanslarını ekrana yazdıran metot
    public static void printLetterFrequencies(Map<Character, Integer> frequencyMap) {
        System.out.println("\nHarf Frekansları:");
        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}