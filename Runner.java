public class Runner {
     public static void main(String[] args) {
        Character metagross = new Character(
"Metagross",
            100,
            5.9,
            10,
            "Defender",
            (int)(Math.random() * 50) + 1
        );
        Enemy articuno = new Enemy(
            "Articuno",
            100,
            23.5,
            20,
            "Attacker",
            (int)(Math.random() * 50) + 1,
            true
        );

        articuno.attackCharacter(metagross);
        metagross.attackEnemy(articuno);

        System.out.println(metagross);
        System.out.println(articuno);
    }
}