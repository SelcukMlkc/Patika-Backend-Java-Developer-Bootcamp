package week2.technicalContent4;

public abstract class Animal {

    //abstract class (soyut sınıf), nesne üretilemeyen ama alt sınıflar tarafından miras alınarak kullanılabilen bir sınıf türüdür.
    //Genellikle, ortak özellik ve davranışları tanımlamak için kullanılır.
    //abstract class, kendi başına tam bir şey değildir ama bir temel (şablon) oluşturur.
    //İçinde hem tamamlanmış (gövdesi olan) metotlar, hem de tamamlanmamış (abstract) metotlar olabilir.

    public abstract void makesound (); //method'un body'si yok. yani implementation yok. çünkü soyut

    public void sleep (){

        System.out.println("Sleeping ...");
    }




}
