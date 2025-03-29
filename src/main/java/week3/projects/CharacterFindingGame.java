package week3.projects;

import java.util.ArrayList;
import java.util.Scanner;

public class CharacterFindingGame {

    public static void main(String[] args) {

        ArrayList<String> characters = new ArrayList<>(4);


        characters.add("S");
        characters.add("B");
        characters.add("Z");
        characters.add("M");

        System.out.println("Önce: " + characters);


        Scanner scanner = new Scanner(System.in);

        // 4 kez harf girme işlemi için döngü kullan
        for (int i = 1; i <= 4; i++) {
            System.out.println(i + ". Rastgele bir harf giriniz: ");
            String userInput = scanner.next();
            updateCharacterList(characters, userInput);
        }

        System.out.println("Listenin son hali: " + characters);
    }

    // Karakter listesinde güncelleme yapan metot
    private static void updateCharacterList(ArrayList<String> characters, String userInput) {
        String found = "found";
        boolean isFound = false;

        for (int j = 0; j < characters.size(); j++) {
            if (characters.get(j).equals(userInput)) {
                characters.set(j, found);
                isFound = true;
                break;
            }
        }

        if (!isFound) {
            characters.add(userInput);
        }
    }
}