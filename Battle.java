import java.util.Scanner;

public class Battle {
    private Scanner kb;
    private Character player;
    private Enemy enemy;
    private int turnCount;

    public Battle() {
        kb = new Scanner(System.in);
        this.turnCount = 1;
    }

    public void scannerTest() {
        System.out.print("Enter an option: ");
        int option = kb.nextInt();
        System.out.print("Option entered was " + option);
    }

    public void battle(Character c, Enemy e) {
        this.player = c;
        this.enemy = e;

        System.out.println("Battle start: " + player.getName() + " vs. " + enemy.getName());

        while (player.getHealth() > 0 && enemy.getHealth() > 0) {
            System.out.println("\n- Turn " + turnCount + " -");

            if (player.getSpeed() >= enemy.getSpeed()) {
                System.out.print("Type anything and press Enter for " + player.getName() + "'s attack: ");
                kb.nextLine();
                player.attackEnemy(enemy);

                if (enemy.getHealth() > 0) {
                    System.out.print("Type anything and press Enter for " + enemy.getName() + "'s attack: ");
                    kb.nextLine();
                    enemy.attackCharacter(player);
                }
            } else {
                System.out.print("Type anything and press Enter for " + enemy.getName() + "'s attack: ");
                kb.nextLine();
                enemy.attackCharacter(player);

                if (player.getHealth() > 0) {
                    System.out.print("Type anything and press Enter for " + player.getName() + "'s attack: ");
                    kb.nextLine();
                    player.attackEnemy(enemy);
                }
            }

            printStatus();
            turnCount++;
        }

        System.out.println("\nBattle Over!");
        if (player.getHealth() > 0) {
            System.out.println(player.getName() + " wins!~ 🎉");
        } else {
            System.out.println(enemy.getName() + " wins! 😈");
        }
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

        public void status() {
        if (player.getHealth() >= 30) {
            System.out.println("🔋 " + player.getName() + " Health: " + player.getHealth());
        } else {
            System.out.println("🪫 " + player.getName() + " Health: " + player.getHealth());
        }

        if (enemy.getHealth() >= 30) {
            System.out.println("🔋 " + enemy.getName() + " Health: " + enemy.getHealth());
        } else {
            System.out.println("🪫 " + enemy.getName() + " Health: " + enemy.getHealth());
        }
    }

}
