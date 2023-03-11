package Battle;

public class Enemy implements Mortal{

    private int health;

    public int getHealth(){
        return health;
    }

    public void setHealth(int health){
        this.health = health;
    }

    Enemy(int health){
        this.health = health;

    }
    @Override
    public boolean isAlive(){
        boolean alive = true;
        if (getHealth()>0){
            return alive;
        }else{
            alive = false;
            return alive;
        }
    }

    public void takeDamage(int damage){
        setHealth(health-damage);

    }

    @Override
    public String toString() {
        return "Враг";
    }
}
