package week2.technicalContent4.gameProject;

public class Character {

    protected String name;
    protected int health;
    protected int attackPower;


    public Character(String name, int health, int attackPower) {
        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
    }

    public void attack() {
        System.out.println(name + " saldırıyor! Hasar:" + attackPower);
    }

    public void showStats(){
        System.out.println("Karakter : " + name);
        System.out.println("Can : " + health);
        System.out.println("Saldırı Gücü : "+ attackPower);
        System.out.println("------------------------------");

    }
}
