package Battle;

public class Mage extends Hero{
    Mage(String name,int health){
        super(name,health);
    }

    int healing = 15;


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

    @Override
    public void heal(Hero hero){
        hero.setHealth(getHealth()+healing);
        System.out.println(getName()+" лечит "+hero.getName()+" на "+healing+" хп.\n" +
                "У "+hero.getName()+" стало "+hero.getHealth()+" хп.");

    }

    public void attackAOE(Enemy...enemies){
        Enemy[] enemyArray = new Enemy[enemies.length];
        for (int i = 0;i < enemyArray.length;i++){
            enemies[i].takeDamage(20);
            System.out.println(enemies[i]+" получает 20 урона");
        }

    }
}
