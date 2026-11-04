
public class Runner {

    public static void main(String[] args) {
        Character player1 = new Character(
            "user",
            100,
            true,
            5.9,
            10,
            "Defender",
            20

    );
            
Enemy player2 = new Enemy(
            "enemy",
            80,
            true,
            5.9,
            10,
            "Defender",
            20

    );

            if( player1.getHealth() > 0 && player2.getHealth()>0){
                player2.setHealth(player2.getHealth() - player1.getAttack());
            }

            if(player1.getHealth()>0 && player2.getHealth()>0){
                player1.setHealth(player1.getHealth() - player2.getAttack());

            }
            System.out.println(player1);
            System.out.println(player2);

    }


}
