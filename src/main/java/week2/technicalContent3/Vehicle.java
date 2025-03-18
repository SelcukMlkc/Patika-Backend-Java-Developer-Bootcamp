package week2.technicalContent3;

public interface Vehicle {

    public void start (); //public kullanımı gereksiz çünkü doğası gereği metodlar puplictir

    private void stop() {    //body si olmayan bu tarz interface metodlar abstrac metod yani soyut metod olarak geçer

        //kod varlığı önemli değil
        //java 8 öncesinde bu kullanım hatalı. boş bırakamıyordun

    }

    default void stop1() {

        //java 8 öncesinde interface içerisidne defult tanımı yapılamazdı

    }

    // default void stop2()  defult metod ve body'si olmayan metod tanımı yapılamaz

}
