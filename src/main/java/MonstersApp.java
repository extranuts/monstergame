import java.util.Scanner;

public class MonstersApp {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String heroName = "Her Major";
        String monsterName = "Troll";

        int heroHp = 10;
        int monsterHp = 5;

        int heroAttackPower = 2;
        int monsterAttackPower = 1;

        System.out.println(heroName + " Начинает свое путешествие");
        System.out.println(heroName + " сразу же попадает в засаду. Из леса на него нападает тролль");

        System.out.println("Битва началась");
        System.out.println(heroName + " каковы будут ваши действия?");

        while (true) {


            System.out.println("Ход героя " + heroName);
            System.out.println(heroName + ", каковы будут ваши действия?");

            var input = sc.next();

            if (input.equals("/ударить")) {
                monsterHp -= heroAttackPower;
                System.out.println(heroName + " нанес персонажу " +
                        "" + monsterName + " урон " + heroAttackPower);
                System.out.println("У персонажа " + monsterName + " осталось " + monsterHp + " ед. здоровья");
                if(monsterHp <= 0) {
                    System.out.println(heroName + " победил персонажа " + monsterName);
                    break;
                }
            }

            System.out.println("Ход монстра: " + monsterName);
            heroHp -= monsterAttackPower;
            System.out.println(monsterName + " нанес персонажу " + heroName + " урон = " + monsterAttackPower);
            System.out.println("У персонажа " + heroName + " осталось " + heroHp + " ед. здоровья");
            if(heroHp<= 0 ) {
                System.out.println(monsterName + " победил персонажа " + heroName);
                break;
            }


        }


        System.out.println("Игра завершена!");
    }
}
