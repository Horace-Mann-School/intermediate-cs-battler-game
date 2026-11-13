import java.util.Scanner;
public class Battle {
    private Character player;
    private Enemy enemy;
    private int turnCount;

    public Battle(Character player, Enemy enemy) {
        this.player = player;
        this.enemy = enemy;
        this.turnCount = 1;
    }

public void startBattle() {
        System.out.println("=== BATTLE START: " + player.getName() + " vs. " + enemy.getName() + " ===");

        while (player.getHealth() > 0 && enemy.getHealth() > 0) {
            System.out.println("\n--- Turn " + turnCount + " ---");

            player.attackEnemy(enemy);
            if (enemy.getHealth() <= 0) {
                System.out.println(enemy.getName() + " has been defeated!");
                System.out.println("Winner: " + player.getName());
                break;
            }

            enemy.attackCharacter(player);
            if (player.getHealth() <= 0) {
                System.out.println(player.getName() + " has been defeated!");
                System.out.println("Winner: " + enemy.getName());
                break;
            }

            printStatus();
            turnCount++;
        }

        System.out.println("=== BATTLE OVER ===");
    }

    public void printStatus() {
        System.out.println(player);
        System.out.println(enemy);
    }

    // getters & Setters
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


