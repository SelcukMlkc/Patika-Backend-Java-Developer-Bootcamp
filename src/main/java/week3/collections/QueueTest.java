package week3.collections;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest {

    public static void main(String[] args) {

        Queue<String> breadQueue = new PriorityQueue<>();

        breadQueue.add("Cem");
        breadQueue.add("Emir");
        breadQueue.add("Ahmet");
        breadQueue.add("Ayşe");

        System.out.println(breadQueue);  //(Sıralı gibi görünebilir ama garanti değil) ?

        //📌 PriorityQueue, FIFO (First In First Out) mantığıyla çalışmaz.
        //📌 Alfabetik sıralama yaptığı için Ahmet en başa geçti!
        //📌 FIFO istiyorsan, LinkedList kullanmalısın.

        breadQueue.remove();

        //işleme sıranın başından başlar

        System.out.println(breadQueue);
    }
}
