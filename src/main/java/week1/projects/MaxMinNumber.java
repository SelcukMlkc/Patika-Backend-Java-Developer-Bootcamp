package week1.projects;

import java.util.Scanner;

public class MaxMinNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen bir sayı giriniz: ");
        int number = scanner.nextInt();

        if (number < 0) {
            System.out.println("Lütfen negatif sayı girmeyiniz.");
            return;
        }

        int min = -1; // İlk 12'ye bölünebilen sayıyı tutacak
        int max = -1; // Son 12'ye bölünebilen sayıyı tutacak

        for (int i = 0; i <= number; i++) {
            if (i % 12 == 0) {
                if (min == -1) {
                    min = i; // Döngünün ilk i'sini minimum sayı olarak tanımladık.
                }
                max = i; // Parantezi kapattık ve bu i bize döngünün son i'sini veriyor. Bunu max sayı olarak tanımladık.
            }
        }


        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
        if (max <= 12) {
            System.out.println("Ortalama Değer: " + (min + max) / 2);
        } else {
            System.out.println("Ortalama Değer: " + ((min + 12) + max) / 2);
        }

        scanner.close();
    }
}
