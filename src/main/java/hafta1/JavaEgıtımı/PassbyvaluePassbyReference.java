package hafta1.JavaEgıtımı;

public class PassbyvaluePassbyReference {

    int x;

    public static void main(String[] args) {

        int a = 5 ;

        System.out.println("İlk değer = " + a);

        degistir(a);

        System.out.println("Son değer = " + a);

        PassbyvaluePassbyReference m1 = new PassbyvaluePassbyReference();

        m1.x = 10;

        System.out.println("İlk değer = " + m1.x);

        m1.degistir2(m1);  //

        System.out.println("Son değer = " + m1.x);

        int[] array = {1, 2, 3, 4, 5};

        System.out.println("İlk değer = " + array[0]);

        degistir3(array);

        System.out.println("Son değer = " + array[0]);



    }

    static void degistir3(int[] array) {

        array[0] = array[0] + 10;
    }

    void degistir2(PassbyvaluePassbyReference m1) {

        m1.x = m1.x + 10;

    }

    public static void degistir(int a) {

        a = a+ 10;

    }
}
