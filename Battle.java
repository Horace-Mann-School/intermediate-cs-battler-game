import java.util.Scanner;

public class Battle {
private Scanner kb; 
private Character character;
private Enemy enemy;



public Battle(){
    kb = new Scanner(System.in); 
}
public void scannerTest() {
    System.out.print("Enter an option: ");
    String option = kb.nextLine();
    System.out.print("Option entered was " + option);
}

this.enemy = enemy;
this.character = character;

public void battlePokemon(Character c, Enemy e){


while (character.getHealth() > 0 && enemy.getHealth() >0){
    c.attackEnemy(e);

    System.out.println(c.getName() + "Attack");
}
}

}