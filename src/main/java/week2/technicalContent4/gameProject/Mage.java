package week2.technicalContent4.gameProject;

public class Mage extends Character {


    public Mage(String name) {
        super(name, 1000, 400);
    }

    @Override
    public void attack() {
        System.out.println(name + " Büyü yapıyor! Hasar: " + attackPower);
    }

    public void castSpell() {
        System.out.println(name + " Ateş topu büyüsü yapıyor!");

    }
}
