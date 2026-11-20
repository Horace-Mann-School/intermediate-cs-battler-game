
public class Runner {
     public static void main(String[] args) {
        Character metagross = new Character(
"Metagross",
            100,
            5.9,
            10,
            "Defender",
            20,
            8
        );
        Enemy articuno = new Enemy(
            "Articuno",
            100,
            23.5,
            20,
            "Attacker",
            18,
            true,
            10
        );

        Battle fight = new Battle();
        fight.battlePokemon(articuno, metagross);
        
        // System.out.println(metagross);
        // System.out.println(articuno);

    }
//methods to lower hp, from attacks

            
        public static void attackCharacter(Enemy x, Character y){
        int charhealth = y.getHealth(); 
        charhealth -= y.getAttack()-4+(int)(Math.random()*8);
        if(charhealth < 0){
            charhealth = 0;
        }
        y.setHealth(charhealth);
        }

    public static void attackEnemy(Enemy x, Character y){
        int charhealth = x.getHealth();
        charhealth -= x.getAttack()-4+(int)(Math.random()*8);
        if(charhealth < 0){
            charhealth = 0;
        }
        x.setHealth(charhealth);
    }

    }