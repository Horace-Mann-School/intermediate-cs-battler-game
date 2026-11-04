
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

        System.out.println("BEFORE BATTLE:");
        System.out.println(player1);
        System.out.println(enemy1);

        // character attacks Enemy
        if (player1.getHealth() > 0 && enemy1.getHealth() > 0) {
            attackEnemy(player1, enemy1);
            System.out.println("Character attacks Enemy!");
        }

        // enemy attacks Character
        if (enemy1.getHealth() > 0 && player1.getHealth() > 0) {
            attackCharacter(enemy1, player1);
            System.out.println("Enemy attacks Character!");
        }

        System.out.println("\nAFTER BATTLE:");
        System.out.println(player1);
        System.out.println(enemy1);
    }

    // enemy losing health from character attack
    public static void attackEnemy(Character player, Enemy enemy) {

        int damage = player.getAttack();
        int remainingHealth = enemy.getHealth();

        remainingHealth = remainingHealth - damage;

        if (remainingHealth < 0) {
            remainingHealth = 0;
        }

        enemy.setHealth(remainingHealth);

        if (remainingHealth == 0) {
            enemy.setDead(true);
        }

        System.out.println("Enemy lost " + damage + " HP");
    }

    // character losing health from enemy attck
    public static void attackCharacter(Enemy enemy, Character player) {

        int damage = enemy.getAttack();
        int remainingHealth = player.getHealth();

        remainingHealth = remainingHealth - damage;

        if (remainingHealth < 0) {
            remainingHealth = 0;
        }

        player.setHealth(remainingHealth);

        if (remainingHealth == 0) {
            player.setAlive(false);
        }

        System.out.println("Character lost " + damage + " HP");
    }
}
