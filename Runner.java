
public class Runner {

    public static void main(String[] args) {
        Character player1 = new Character(
            "Suicune",
            200,
            5.9,
            10,
            "Water",
            20
        );

        Enemy enemy1 = new Enemy(
            "Charmander",
            50,
            5.2,
            1,
            "Fire",
            10
        );

        System.out.println(player1.getHealth());
        System.out.println(enemy1.getHealth());
        if (player1.getHealth() > 0) {
            player1.setHealth(player1.getHealth() - enemy1.getAttack());
        }
        if (enemy1.getHealth() > 0) {
            enemy1.setHealth(enemy1.getHealth() - player1.getAttack());
        }
        System.out.println(player1.getHealth());
        System.out.println(enemy1.getHealth());
    }

}
