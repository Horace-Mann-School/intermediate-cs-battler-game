
public class Runner {
    static Character metagross = new Character(
"Metagross",
            100,
            5.9,
            10,
            "Defender",
            20,
            (int)(Math.random() * 100)//randomly generating an integer from 0-99
            
        );

        static Enemy articuno = new Enemy(
            "Articuno",
            100,
            23.5,
            20,
            "Attacker",
            18,
            true,
            (int)(Math.random() * 100)//randomly generating an integer from 0-99
        );
     public static void main(String[] args) {
Battle b = new Battle();
b.scannerTest();

        
        

        articuno.attackCharacter(metagross);
        metagross.attackEnemy(articuno);

        System.out.println(metagross);
        System.out.println(articuno);

        b.battle(metagross, articuno);

    }

    }