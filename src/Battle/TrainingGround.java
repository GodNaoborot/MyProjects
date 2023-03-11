package Battle;

public class TrainingGround {

    public static void main(String[] args) {
        Hero a = new Archer("Aragorn",100);
        Hero a2 = new Warrior("Midir",100);
        Mage a3 = new Mage("Arthas",100);
        Enemy e1 = new Enemy(100);
        Enemy z1 = new Zombie(100);
        System.out.println(e1.isAlive());
        a3.attackAOE(e1,z1);







    }
}
