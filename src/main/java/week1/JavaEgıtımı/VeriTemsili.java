package week1.JavaEgıtımı;

public class VeriTemsili {

    /**
     * Bu method silinmemesi gerekir
     * @author SELÇUK
     * @param args
     */

    public static void main(java.lang.String[] args) {

        //System.out.println("Hello Patika.dev1");
        /*
        System.out.println("Hello Patika.dev2");
        System.out.println("Hello Patika.dev3"); */


        int i = 30;  // TODO ÖRNEĞİN BU 30 İLERİDE ARTTIRILABİLİR.

        int i1 = 50;

        boolean isA;

        isA = true;

        isA = false;

        i = -5000;

        i1 = 300 + i;

        byte b = 127;


        b = -128;

        char c = 'c';

        System.out.println(c);

        char c1 = 'A';

        System.out.println(c1);

        int i3 = 2_000_000_000;

        long l;

        l = 200;

        long l1 = 100;

        int sum = 100 + 200;

        int x = 10, y = 20;

        int sum1 = x + y;
        System.out.println("Toplam:" + sum1);

        int result = x - y;
        System.out.println("Çıkarma:" + result);

        double result1 = x * 5.5;
        System.out.println("Çarpma:" + result1);

        int result2 = x / y;
        System.out.println("Bölme:" + result2);

        int result3 = x % y;
        System.out.println("Mod:" + result3);

        boolean isEquals = x == y;
        boolean isEquals1 = 10 == y;

        boolean isEquals2 = x != y;
        boolean isGreather = x > 20;
        boolean isEqualsOrGreather = x >= 20;
        boolean isLessThan = x < 5;
        boolean isEqualsOrLess = x <= result2;

        boolean isTrue = isEquals && isEquals1;
        boolean isTrue1 = true && false;

        boolean isFalse = false || true;
        boolean isFalse1 = (false || true) && (false && false) || (true && true && false);


        java.lang.String name = "Merhaba Dünya!";
        System.out.println(name);

        int length = name.length();
        System.out.println(length);

        java.lang.String toUpper = name.toUpperCase();
        System.out.println(toUpper);

        System.out.println(name.toLowerCase());

        System.out.println(name.charAt(4));

        System.out.println("Merhaba Patika".substring(7));

        java.lang.String hi = "merhaba";
        System.out.println(hi + " Patika " + name);

        boolean isStringEquals = hi.equals(name);
        System.out.println(isStringEquals);
        boolean isStringEquals1 = "hi".equals("Patika");
        System.out.println(isStringEquals1);

        java.lang.String s1 = "Java";
        java.lang.String s2 = new java.lang.String("Java");
        java.lang.String s3 = "java";
        java.lang.String s4 = "Java";

        System.out.println("s1 eşit mi s2: " + s1.equals(s2) );
        System.out.println("s1 eşit mi s3: " + s1.equals(s3) );

        System.out.println("s1 eşit mi s2: " + s1 == s2 );
        System.out.println("s1 eşit mi s4: " + s1 == s4 );
        System.out.println( s1 == s4 );




























    }
}
