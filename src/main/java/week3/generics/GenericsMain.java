package week3.generics;

public class GenericsMain {

    public static void main(String[] args) {

        Box<String> stringBox = new Box<>();
        stringBox.setContent("Hello Generics");

        Box<Boolean> booleanBox = new Box<>();
        booleanBox.setContent(true);

        Box<Animal> animalBox = new Box<>();

        Animal animal = new Animal();
        animalBox.setContent(animal);  //animal objesini animalBox'ın içine verdim

        //---------------------

        String array[] = {"Java", "Ptyon", "C++", "Javascript"};
        GenericMethodExample.printArray(array);

        Integer array2[] = {1,2,3,4,5};
        GenericMethodExample.printArray(array2);

        //int array3[] = {1,2,3,4,5,6};
        //GenericMethodExample.printArray(array3);  //bunu kullanamıyoruz

        // Java'da Generics sadece referans türleri ile çalışır; primitive türleri (int, double, char vs.) kullanamazsınız.

        //BoundedGenericExample<Integer> integerBoundedGenericExample = new BoundedGenericExample<Integer>();
        //burada hata alıyoruz çünkü Integer Animaldan türemiyor. Biz BoundedGenericExample'ı extend Animal yapmıştık

        BoundedGenericExample<Animal> animalBoundedGenericExample = new BoundedGenericExample<Animal>();

        animalBoundedGenericExample.setContent(new Animal());





    }
}
