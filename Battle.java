import java.util.Scanner;
public class Battle {
    private Scanner kb;
    private int numberOfTurns;
    private int currentTurn;
    private boolean playerTurn;

    public Battle() {
        kb = new Scanner(System.in);
    }
    
    public void startBattle(Character c, Enemy e) {

        while(c.getisAlive() && e.getisAlive()) {
            System.out.print("Enter an option: ");
            int option = kb.nextInt();
            System.out.print("Option entered was " + option);
            //decide speed
            turnOrder(c,e);
            while(getCurrentTurn() == getNumberOfTurns()) {

            }
            
        }

    }

    public void turnOrder(Character c, Enemy e) {
        if (c.getSpeed() > e.getSpeed()) {
                setPlayerTurn(true);
            } else if (c.getSpeed() > e.getSpeed()) {
                if (Math.random() >= 0.5) {
                    setPlayerTurn(true);
                } else {
                    setPlayerTurn(false);
                }
            } else {
                setPlayerTurn(false);
            }
    } 

    //Accessors and Mutators
    public int getNumberOfTurns() {
        return numberOfTurns;
    }
    public int getCurrentTurn() {
        return currentTurn;
    }
    public boolean getPlayerTurn() {
        return playerTurn;
    }

    public void setNumberOfTurns(int numberOfTurns) {
        Utility.validateNonNegative(numberOfTurns);
        this.numberOfTurns = numberOfTurns;
    }
    public void setCurrentTurn(int currentTurn) {
        Utility.validateNonNegative(currentTurn);
        this.currentTurn = currentTurn;
    }
    public void setPlayerTurn(boolean playerTurn) {
        this.playerTurn = playerTurn;
    }
}
