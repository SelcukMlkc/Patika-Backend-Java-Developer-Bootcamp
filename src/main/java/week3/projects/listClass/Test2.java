package week3.projects.listClass;

public class Test2 {

    public static void main(String[] args) {
        // Test 1: Kapasite ve Eleman Sayısı
        MyList<Integer> liste1 = new MyList<>();
        System.out.println("Dizideki Eleman Sayısı : " + liste1.size());
        System.out.println("Dizinin Kapasitesi : " + liste1.getCapacity());
        liste1.add(10);
        liste1.add(20);
        liste1.add(30);
        liste1.add(40);
        System.out.println("Dizideki Eleman Sayısı : " + liste1.size());
        System.out.println("Dizinin Kapasitesi : " + liste1.getCapacity());
        liste1.add(50);
        liste1.add(60);
        liste1.add(70);
        liste1.add(80);
        liste1.add(90);
        liste1.add(100);
        liste1.add(110);
        System.out.println("Dizideki Eleman Sayısı : " + liste1.size());
        System.out.println("Dizinin Kapasitesi : " + liste1.getCapacity());

        // Test 2: get, remove, set, toString
        MyList<Integer> liste2 = new MyList<>();
        liste2.add(10);
        liste2.add(20);
        liste2.add(30);
        System.out.println("2. indisteki değer : " + liste2.get(2));
        liste2.remove(2);
        liste2.add(40);
        liste2.set(0, 100);
        System.out.println("2. indisteki değer : " + liste2.get(2));
        System.out.println(liste2.toString());
    }
}

