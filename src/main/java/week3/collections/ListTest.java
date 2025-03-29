package week3.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListTest {

    public static void main(String[] args) {

        ArrayList<Integer> integers = new ArrayList<>(30);

        ArrayList<Integer> integers1 = new ArrayList<>();

        List<String> shopingList = new ArrayList<>();   // her arraylist bir list dir. Bu şekilde de yapabilirim

        shopingList.add("Banana");
        shopingList.add("Apple");
        shopingList.add(2, "Mango"); //index 3 yapınca size hatası alıyorsun. 3 sonraki index olduğu için atamadı! Eğer 1 yaparsan 1 e mangoyu yazıp sonra apple yazıyor!
        shopingList.add("Banana");

        // ekrana yazdırcaz şimdi

        for (String s : shopingList) {
            System.out.println(s);
        }

        shopingList.remove("Apple");
        System.out.println(shopingList);  // foreach yerine bu şekilde de yazdırabilirsin


        ArrayList<String> shopingList2 = new ArrayList<>();
        shopingList2.add("Milk");

        shopingList.addAll(shopingList2);

        System.out.println(shopingList);

        System.out.println(shopingList.contains("Banana"));

        System.out.println("Alışveriş listenizde " + shopingList.size() + " adet ürün var.");

        System.out.println(shopingList.getLast());  //sepete en son ne eklediğini yazıyor



        //---LinkedList

        LinkedList<String>linkedList = new LinkedList<>();

        List<String> names = new LinkedList<>();

        names.add("Cem");
        names.add("Patika");
        names.add("Java Kursu");

        System.out.println(names);





    }
}
