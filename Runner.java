
public class Runner {

    public static void main(String[] args) {
        Character player1 = new Character(
            "Player",
            100,
            true,
            5.8,
            10,
            "Defender",
            20
        );

        Enemy enemy1 = new Enemy(
            "Monster",
            80,
            false,
            5.10,
            10,
            "Villain",
            15
        );

        System.out.println(player1);
        System.out.println(enemy1);

        // Character attacks Enemy
        if (player1.getHealth() > 0 && enemy1.getHealth() > 0) {
            enemy1.setHealth(Math.max(0, enemy1.getHealth() - player1.getAttack()));
        }

        if (enemy1.getHealth() == 0) {
            enemy1.setDead(true);
        }

        // Enemy attacks Character
        if (enemy1.getHealth() > 0 && player1.getHealth() > 0) {
            player1.setHealth(Math.max(0, player1.getHealth() - enemy1.getAttack()));
        }

        if (player1.getHealth() == 0) {
            player1.setAlive(false);
        }

        // Display updated profiles
        System.out.println("\nAFTER THE BATTLE:");
        System.out.println(player1);
        System.out.println(enemy1);
    }

}
