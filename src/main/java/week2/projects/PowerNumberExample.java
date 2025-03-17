package week2.projects;

import java.util.Scanner;

public class PowerNumberExample {

    public static void main(String[] args) {

        // recursive üs alma

        Scanner scanner = new Scanner(System.in);

        System.out.println("Taban değeri giriniz : ");
        int base = scanner.nextInt();

        System.out.println("Bir üst değeri giriniz : ");
        int power = scanner.nextInt();

        // şimdi bir recursive metodu belirliycez

        int result = power(base, power);

        System.out.println(base + "^" + power + " = " + result);
    }

    //power metodunu tanımlamamız lazım şimdi:

    private static int power(int base, int power) {

        if (power == 0) return 1;  //Recursive fonksiyonlar bir durma koşulu (base case) içermelidir, aksi takdirde sonsuz döngüye girer.
            return base * power(base, power-1); // 2*power(2 * (power))*1

    }

}

        /* çalışma mantığı Örneğin, kullanıcı base = 2 ve power = 3 girdiyse, şu işlem yapılır:

        power(2, 3)  = 2 * power(2, 2)
power(2, 2)  = 2 * power(2, 1)
power(2, 1)  = 2 * power(2, 0)
power(2, 0)  = 1  (Base Case: 0. kuvvet her zaman 1)


power(2, 1)  = 2 * 1  = 2
power(2, 2)  = 2 * 2  = 4
power(2, 3)  = 2 * 4  = 8


         */

