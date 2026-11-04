
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
    }

}
