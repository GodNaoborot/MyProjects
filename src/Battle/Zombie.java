package Battle;

public class Zombie extends Enemy{
    public Zombie(int health) {
        super(health);
    }



    @Override
    public void takeDamage(int damage){
        int chanceToReincarnate = (int)(Math.random()*3);
        setHealth(getHealth()-damage);
        if(getHealth()<=0){
            if(chanceToReincarnate==2){
                setHealth(50);
                System.out.println("Враг смог возродиться с "+getHealth()+" хп");
                System.out.println();
            }
        }
    }
}
