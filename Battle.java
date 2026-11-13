import java.util.Scanner;
public class Battle {
    
    private int numberOfTurns;
    private boolean playerTurn;

    public void battle(Character c, Enemy e) {

        while(c.getisAlive() && e.getisAlive()) {
            Scanner choice = new Scanner(System.in);
            System.out.println(choice);
            //decide speed
            
            
        }

    }

    public void turnOrder(Character c, Enemy e) {
        if (c.getSpeed() > e.getSpeed()) {
                playerTurn = true;
            } else if (c.getSpeed() > e.getSpeed()) {
                if (Math.random() >= 0.5) {
                    playerTurn = true;
                } else {
                    playerTurn = false;
                }
            } else {
                playerTurn = false;
            }
    } 
}
