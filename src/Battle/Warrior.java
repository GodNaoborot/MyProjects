package Battle;

public class Warrior extends Hero{
    Warrior(String name,int health){
        super(name,health);
    }
    @Override
    public void attackEnemy(Enemy enemy){
        int damage = 8;
        int enemyChanceToAttack = (int)(Math.random()*5);
        enemy.takeDamage(damage);
        if (enemy.getHealth()>0) {
            System.out.println(getName() + " атакует врага и у врага остается " + enemy.getHealth() + " хп, нанеся " + damage + " урона");

        }else{
            System.out.println("Враг погиб");
        }
        if(enemy.getHealth()>0 &enemy.getHealth()<100){
            if(enemyChanceToAttack==2){
                setHealth(getHealth()-10);
                System.out.println("Враг контратаковал "+getName()+" и нанес 10 урона.\n" +
                        "У "+getName()+" осталось "+getHealth()+" хп");

            }
        }

    }
}
