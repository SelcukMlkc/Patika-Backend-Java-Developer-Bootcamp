package week2.methods;

public class RecursiveExample {

    public static void main(String[] args) {

        int sonuc = toplam(10);
        System.out.println(sonuc );
    }
    public static int toplam(int k) {
        if (k > 0) {
            return k + toplam(k - 1);
        } else {
            return 0;
        }
    }
}

/* toplam(10) = 10 + toplam(9)
toplam(9)  = 9  + toplam(8)
toplam(8)  = 8  + toplam(7)
toplam(7)  = 7  + toplam(6)
toplam(6)  = 6  + toplam(5)
toplam(5)  = 5  + toplam(4)
toplam(4)  = 4  + toplam(3)
toplam(3)  = 3  + toplam(2)
toplam(2)  = 2  + toplam(1)
toplam(1)  = 1  + toplam(0)
toplam(0)  = 0  (Base Case)

Base case (k == 0) sağlandığında, artık geriye doğru toplamalar yapılır:

toplam(1)  = 1 + 0  = 1
toplam(2)  = 2 + 1  = 3
toplam(3)  = 3 + 3  = 6
toplam(4)  = 4 + 6  = 10
toplam(5)  = 5 + 10 = 15
toplam(6)  = 6 + 15 = 21
toplam(7)  = 7 + 21 = 28
toplam(8)  = 8 + 28 = 36
toplam(9)  = 9 + 36 = 45
toplam(10) = 10 + 45 = 55

 */
