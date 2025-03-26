package week2.technicalContent4.gameProject;

public class Archer extends Character{
    public Archer(String name) {
        super(name, 1200, 350);
    }

    @Override
    public void attack() {
        System.out.println(name + " Ok fırlatıyor! Hasar: " + attackPower);
    }

    public void multiShot() {
        System.out.println(name + " Ok yağmuru yolladı!");

    }
}
