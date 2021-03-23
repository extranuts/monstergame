import java.util.Scanner;

public class MonstersApp {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        GameCharacter hero = new GameCharacter("Sir bob", 10, 2);
        GameCharacter monster = new GameCharacter("Troll", 6, 2);

        System.out.println(hero.name + " Начинает свое путешествие\n");
        System.out.println(hero.name + " сразу же попадает в засаду. Из леса на него нападает тролль");

        System.out.println("Битва началась");
        System.out.println(hero.name + " каковы будут ваши действия?\n");
        System.out.println("Доступные команды:\n" +
                "/ударить\n" +
                "/блок\n" +
                " ");


        while (true) {
            System.out.println("\nХод героя " + hero.name);
            System.out.println(hero.name + ", каковы будут ваши действия?");
            var input = sc.next();
            if (input.equals("/ударить")) {
                hero.attack(monster);
                if(monster.hp <= 0) {
                    System.out.println(hero.name + " победил персонажа " + monster.name);
                    break;
                }
            }
            if(input.equals("/блок")){
                hero.blockAction();
            }

            System.out.println("\nХод монстра: " + monster.name);
            monster.reset();
            if (Math.random()<0.5) {
                monster.attack(hero);
                if(hero.hp <= 0 ) {
                    System.out.println(monster.name+ " победил персонажа " + hero.name);
                    break;
                }
            } else {
                monster.blockAction();
            }
        }

        System.out.println("Игра завершена!");
    }
}
