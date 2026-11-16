
import java.util.Scanner;

public class Battle {
    private Character player;
    private Enemy enemy;
    private int turnCount;

    public Battle() {
        this.turnCount = 1;
    }

    public void battle(Character c, Enemy e) {
        this.player = c;
        this.enemy = e;

        Scanner input = new Scanner(System.in);

        System.out.println("=== BATTLE START: " + player.getName() + " vs. " + enemy.getName() + " ===");

        while (player.getHealth() > 0 && enemy.getHealth() > 0) {
            System.out.println("\n--- Turn " + turnCount + " ---");

            if (player.getSpeed() >= enemy.getSpeed()) {
                System.out.println("Type anything and press Enter for " + player.getName() + "'s attack.");
                input.nextLine();
                player.attackEnemy(enemy);

                if (enemy.getHealth() > 0) {
                    System.out.println("Type anything and press Enter for " + enemy.getName() + "'s attack.");
                    input.nextLine();
                    enemy.attackCharacter(player);
                }
            } else {
                System.out.println("Type aything" + enemy.getName() + "'s attack.");
                input.nextLine();
                enemy.attackCharacter(player);

                if (player.getHealth() > 0) {
                    System.out.println("Type anything" + player.getName() + "'s attack.");
                    input.nextLine();
                    player.attackEnemy(enemy);
                }
            input.close();

            }

            printStatus();
            turnCount++;
        }

        if (player.getHealth() <= 0) {
            System.out.println("Winner: " + enemy.getName());
        } else {
            System.out.println("Winner: " + player.getName());
        }

        System.out.println("=== BATTLE OVER ===");
    }

    public void printStatus() {
        System.out.println(player);
        System.out.println(enemy);
    }

    public Character getPlayer() {
        return player;
    }

    public Enemy getEnemy() {
        return enemy;
    }

    public int getTurnCount() {
        return turnCount;
    }
}

