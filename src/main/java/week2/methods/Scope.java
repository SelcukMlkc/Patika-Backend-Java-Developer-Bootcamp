package week2.methods;

public class Scope {

    public static void main(String[] args) {

        // scope = kapsam = süslü parantezler

        int degisken1 = 100;
        int degisken2 = 200;

        System.out.println(degisken2);

        {

            System.out.println(degisken2); // buradan degisken3 e ulaşamıyorum.

            // burada 1 ve 2 scope dışında kalsalar da erişebildim. Çünkü yukarıda oldukları için. Kod bu şekilde çalışıyor

            int degisken3 = 300;

            System.out.println(degisken3);


            {

                int degisken4= 400;

            }

            int degisken5 = 500;

            System.out.println(degisken5);  // burada degisken4 ü alamıyorum. çünkü iç bir scope da kaldı

        }

        int degisken6 = 600;

        System.out.println(degisken6);  // aynı mantık 3,4,5 e erişemem. İç scope da kaldılar
    }
}
