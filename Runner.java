public class Runner {
    public static void main(String[] args) {
        Character player1 = new Character("Player", 100, true, 5.9, 1, "Defender", 20);
        System.out.println(player1);

        Enemy enemy1 = new Enemy("Enemy", 75, true, 8.5, 3, "Goblin", 15);
    }
}