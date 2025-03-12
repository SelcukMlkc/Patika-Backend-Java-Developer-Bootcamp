package week1.loops;

public class LoopsWhileContinue2 {

    public static void main(String[] args) {

        //Şimdi az önceki kodu continue yerine else kullanarak yazacağım!

        int i = 0;
        int sum = 0;

        while (i < 100) {

            if (i % 5 == 0) {
                System.out.println(i + " değeri hesaba dahil değil!");
            } else {
                System.out.println(i + " i değeri");
                sum += i;
            }

            i++; // Hem if hem de else bloğu çalıştıktan sonra artır
        }

        System.out.println("Toplam değer: " + sum);
    }

}
