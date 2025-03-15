package week2.technicalContent1;

public class StringBuilderMain {

    public static void main(String[] args) {

        String name = "patika.dev";
        System.out.println(name);
        name.replace('p', 'P'); // bu değişikliği sout içinde yaparsan işe yarıyor ve o da tek seferlik oluyor
        System.out.println(name);

        //eğer kalıcı bir değişiklik istiyorsan şu şekilde yapabilirsin: var ya da string kullanabilirsin

        var name2 = name.replace('p', 'P');
        System.out.println(name2);

        String name3 = name.replace('p', 'P');
        System.out.println(name3);

        StringBuilder stringBuilder = new StringBuilder(); // String'ler immutable(değiştirilemezdir)

        stringBuilder.append("papatya");

        System.out.println(stringBuilder);

        System.out.println();

        StringBuilder alphabet = new StringBuilder();  // mutable(değişken) bi yapıtır. bu sayede şimdi altdaki gibi değiştirebilecez

        for (char current = 'a'; current <= 'z' ; current++) {
            alphabet.append(current);  // String alpha += current yapamıyoruz çünkü stringler değişmiyor

        }

        System.out.println(alphabet);

/*
        for (char current = 'a'; current <= 'z' ; current++) {
            alphabet.append(current);

            System.out.println(alphabet);

        } Burada ki farkı gör diye yazdım. Ama bunun için üstteki for döngüsünü iptal etmen lazım*/

        StringBuilder builder = new StringBuilder();

        builder.append("Merhaba")
                .append(" ey")
                .append(" koca");

        builder.append(" Dünya!");

        System.out.println(builder);

        System.out.println();

        var hello1 = "hello patika";
        var hello2 =  "hello patika";

        System.out.println(hello1.equals(hello2)); //değerleri eşit mi diye bakıyor
        System.out.println(hello1 == hello2); // hafızadaki yerleri eşit mi

        System.out.println();

        String s = "hello world";
        String s1 = " hello world".trim(); //trim olmadan false çıkmıştı.
        // .trim kullanarak boşlukları kaldırdık ama yine de false çıktı çünkü trim yeni string nesnesi oluşturdu

        System.out.println(s == s1);  // false çıkıyor çünkü iki farklı string değeri var.


        System.out.println();

        var hello3 = new String("hello patika");  //Eğer new String("...") kullanırsan, her seferinde yeni bir String nesnesi oluşturulur.
        var hello4 = new String("hello patika");

        System.out.println(hello3.equals(hello4));  // ✅ true (Çünkü içerikleri aynı)
        System.out.println(hello3 == hello4);      // ❌ false (Farklı nesneler)

        System.out.println();

        var singleString = "Hello World";

        var concat = "Hello";
        concat += " World";

        System.out.println(singleString.equals(concat));
        System.out.println(singleString == concat);

        System.out.println();

        var hi = "Hello world";
        var hi2 = new String("Hello world").intern();
        //intern() metodu, bir String nesnesini String Pool'a ekler ve orada zaten varsa aynı referansı kullanmasını sağlar. Bu yüzden aşağıda true çıktı

        System.out.println(hi == hi2); //intern eklemeden önce eşitlik false çıkmıştı

        System.out.println();

        hi = "Bye bye world";  // bu şekilde string değerini değiştirdim

        System.out.println(hi);

        System.out.println();

        StringBuilder sb = new StringBuilder("Merhaba!");
        sb.insert(7, " Dünya");  // 7. indexten itibaren " Dünya" ekler

        System.out.println(sb);  // Çıktı: Merhaba Dünya!

        StringBuilder sa = new StringBuilder("Yaşım: ");
        sa.insert(6, 30);

        System.out.println(sa);  // Çıktı: Yaşım: 25












    }
}
