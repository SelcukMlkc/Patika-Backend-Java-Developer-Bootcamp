package week1.loops;

public class LoopsWhileContinue {

    public static void main(String[] args) {

        int i = 0 ;

        int sum = 0 ;

        while (i < 100) {

            if ( i % 5 == 0) {

                System.out.println(i + " değeri hesaba dahil değil!");
                i++;
                /* eper i++ yazmazsam sürekli i:0 olarak ve continue çalışmayacaktır
                Eğer bunu continue'nun sonrasına yazarsam continue sonrasında çalışmayacağı için hata alacaksınn!
                 */
                continue;
            }

            System.out.println(i + " i değeri");
            sum += i;
            i++ ;

        }

        System.out.println("Toplam değer: " + sum);
    }
}
