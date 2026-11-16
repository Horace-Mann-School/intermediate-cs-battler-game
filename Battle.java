import java.util.Scanner;

public class Battle {
private Scanner kb; 

public Battle(){
    kb = new Scanner(System.in); 
}
public void scannerTest() {
    System.out.print("Enter an option: ");
    String option = kb.nextLine();
    System.out.print("Option entered was " + option);
}


public void battlePokemon(Character c, Enemy e){

}

}