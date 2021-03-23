/**
 * @author
 * @return
 */


public class GameCharacter {

    String name;
    int hp;
    int attackPower;
    int maxHP;
    boolean block;

    public GameCharacter(String name, int maxHP, int attackPower) {
        this.name = name;
        this.maxHP = maxHP;
        this.hp = this.maxHP;
        this.attackPower = attackPower;
    }

    public void attack(GameCharacter target) {
        int damage = this.attackPower;
        if (target.block) {
            if (Math.random() < 0.75) {
                System.out.println(target.name + " полностью заблокировал атаку");
                return;
            } else {
                damage *= 2;
            }
        }
        target.hp -= this.attackPower;
        System.out.println(this.name + " нанес персонажу " +
                "" + target.name + " урон " + this.attackPower);
        System.out.println("У персонажа " + target.name + " осталось " + target.hp + "/" + target.maxHP+ " ед. здоровья");
    }

    public void blockAction() {
        hp++;
        if(hp> maxHP){
            hp=maxHP;
        }
        block = true;
        System.out.println(this.name + " пытается заблокировать следующую атаку. Получает 1 ед. здоровья");
    }

    public void reset() {
        block = false;
    }

    @Override
    public String toString() {
        return "GameCharacter{" +
                "name='" + name + '\'' +
                ", hp=" + hp +
                ", attackPower=" + attackPower +
                '}';
    }
}
