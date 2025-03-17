package week2.methods.practices;

import java.util.Scanner;

public class ReversedStringExample {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir metin giriniz : ");
        String input = scanner.nextLine();

        String reversedString = reverse(input);

        System.out.println(reversedString);


    }

    private static String reverse (String input){

        if (input.isEmpty()) return input;

        return reverse(input.substring(1)) + input.charAt(0);

    }
}
