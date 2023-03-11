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
            System.out.println(getName() + " ������� ����� � � ����� �������� " + enemy.getHealth() + " ��, ������ " + damage + " �����");

        }else{
            System.out.println("���� �����");
        }
        if(enemy.getHealth()>0 &enemy.getHealth()<100){
            if(enemyChanceToAttack==2){
                setHealth(getHealth()-10);
                System.out.println("���� ������������� "+getName()+" � ����� 10 �����.\n" +
                        "� "+getName()+" �������� "+getHealth()+" ��");

            }
        }

    }

    @Override
    public void heal(Hero hero){
        hero.setHealth(getHealth()+healing);
        System.out.println(getName()+" ����� "+hero.getName()+" �� "+healing+" ��.\n" +
                "� "+hero.getName()+" ����� "+hero.getHealth()+" ��.");

    }

    public void attackAOE(Enemy...enemies){
        Enemy[] enemyArray = new Enemy[enemies.length];
        for (int i = 0;i < enemyArray.length;i++){
            enemies[i].takeDamage(20);
            System.out.println(enemies[i]+" �������� 20 �����");
        }

    }
}
