package week2.technicalContent4.gameProject;

public class Warrior extends Character{


    public Warrior(String name) {
        super(name, 1500, 250);
    }

    @Override
    public void attack() {
        System.out.println(name + " kılıcıyla saldırıyor! Hasar : " + attackPower);
    }

    public void shieldBlck() {
        System.out.println(name + " kalkanını kullanarak savunma yapıyor!");

    }
}
