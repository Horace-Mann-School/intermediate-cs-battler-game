
public class Runner {
     public static void main(String[] args) {
        Character Metagross = new Character(
"Metagross",
            100,
            5.9,
            10,
            "Defender",
            20
        );
        Enemy Articuno = new Enemy(
            "Articuno",
            100,
            23.5,
            20,
            "Attacker",
            18,
            true
        );

        attackCharacter(Articuno, Metagross);
        attackEnemy(Articuno, Metagross);

        System.out.println(Metagross);
        System.out.println(Articuno);

    }

    //methods to lower hp, from attacks

    public static void attackCharacter(Enemy x, Character y){
        int attack = x.getAttack();
        int charhealth = y.getHealth(); 
        charhealth -= attack;
        if(charhealth < 0){
            charhealth = 0;
        }
        y.setHealth(charhealth);
        }

    public static void attackEnemy(Enemy x, Character y){
        int attack = y.getAttack();
        int charhealth = x.getHealth();
        charhealth -= attack;
        if(charhealth < 0){
            charhealth = 0;
        }
        x.setHealth(charhealth);
    }

    }

