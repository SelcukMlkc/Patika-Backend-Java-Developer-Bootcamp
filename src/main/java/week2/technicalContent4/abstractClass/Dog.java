package week2.technicalContent4.abstractClass;

public class Dog extends Animal {

    //dog ve cat somutlar yani bunlardan nesne oluşturabilirsin ama animal ve catfamily den oluşturamazsın

    @Override
    public void makesound() {

        System.out.println("Woof woof!");

    }   //extends: uzanmak, genişletmek anlamında


}
