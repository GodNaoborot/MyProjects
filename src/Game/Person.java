package Game;

public abstract class Person {

    private int Health;

    private int mana;

    private int armor;

    public Person(int health, int mana, int armor, int damage) {
        Health = health;
        this.mana = mana;
        this.armor = armor;
    }

    public int getHealth() {
        return Health;
    }

    public void setHealth(int health) {
        Health = health;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public int attackEnemy(Person enemy){
        return 0;
    }
}
