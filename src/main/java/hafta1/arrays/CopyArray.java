package hafta1.arrays;

public class CopyArray {

    public static void main(String[] args) {

        int[] array = {2, 3, 5, 8, 1, 45, 138, 1238};

        int[] array2 = new int [array.length];  // array2'nin boyutu belirlendi

        System.arraycopy(array, 3, array2, 0, 4);
        //Bu kısa yöntemi. İlk kopyalancak diziyi yazıyoruz,
        // sonra kopalancak dizinin hangi indexinden kopyalamaya başlasın onu seçiyoruz. source port demek. kaynağı soruyor
        //sonra hangi diziye kopyalansın
        //sonra da dest port hedef portu soruyor. hedef dizide hangi indexden başlasın kopyalamaya
        //en sonda ne kadar kopyalasın onu yazıyoruz

        /*
        for (int i = 0; i < array.length ; i++) {

            array2[i] = array[i];  //array'in elemanları array2'ye tanımlandı
            
        }

         */

        for (int i = 0; i < array2.length ; i++) {

        //for (int i = 0; i < array.length; i++) {
           // array2[i] = array[array.length - 1 - i];    //Bu tersten yazmanın yöntemi

            System.out.println(array2[i]);
            
        }


    }
}
