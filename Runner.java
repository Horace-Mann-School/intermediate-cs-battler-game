public class Runner {
     public static void main(String[] args) {
        Character metagross = new Character("Metagross", 100, 5.9, 10, "Defender", 10, 8);
        Enemy articuno = new Enemy("Articuno", 100, 23.5, 20, "Attacker", 20, true, 2);

        Battle b = new Battle();
        b.battle(metagross, articuno);
    }
}