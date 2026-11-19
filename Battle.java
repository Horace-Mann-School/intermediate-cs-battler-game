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

public void battlePokemon(Character c, Enemy e){

    character = c;
    enemy = e;


while (character.getHealth() > 0 && enemy.getHealth() > 0){

    if (character.getSpeed() >= enemy.getSpeed()){

System.out.println(character.getName() + "Attacks First🗡️");


    }
    System.out.println(c.getName() + "Attack");
}
}
    
}
    }

