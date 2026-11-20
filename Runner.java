
public class Runner {
    public static void main(String[] args) {

    Character metagross = new Character(
    "Metagross",
    100,
    35,
    20,
    "Defender",
    20,
    80,
    true
);
        Enemy articuno = new Enemy(
            "Articuno",
            100,
            25,
            20,
            "Attacker",
            18,
            true,
            60
        );

        Battle battle = new Battle();
        battle.battle(metagross, articuno);
    }
}