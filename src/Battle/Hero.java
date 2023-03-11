package Battle;

public abstract class Hero {

    private String name;
    private int health;

    public String getName(){
        return name;
    }

    public int getHealth(){
        return health;
    }

    public void setHealth(int health){
        this.health = health;
    }

    Hero(String name,int health){
        this.name = name;
        this.health = health;
    }

    public void attackEnemy(Enemy enemy){

    }
    public void heal(Hero hero){}

}
