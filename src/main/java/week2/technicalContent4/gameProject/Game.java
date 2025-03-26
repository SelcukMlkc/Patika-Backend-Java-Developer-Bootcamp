package week2.technicalContent4.gameProject;

public class Game {

    public static void main(String[] args) {

        Warrior warrior = new Warrior("Thor");
        Mage mage = new Mage("Ryze");
        Archer archer = new Archer("Legolas");

        warrior.showStats();
        mage.showStats();
        archer.showStats();

        System.out.println();
        System.out.println("==== Saldırılar Başlıyor ===");
        warrior.attack();
        mage.attack();
        archer.attack();

        System.out.println();
        System.out.println("==== Özel Yetenekler ===");
        warrior.shieldBlck();
        mage.castSpell();
        archer.multiShot();

    }
}
