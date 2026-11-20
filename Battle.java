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

public void battle(Character c, Enemy e){

    character = c;
    enemy = e;


while (character.getHealth() > 0 && enemy.getHealth() > 0){

    if (character.getSpeed() >= enemy.getSpeed()){

System.out.println(character.getName() + "Attacks First🗡️");

kb.nextLine(); //enter to attack;

character.attackEnemy(e);

System.out.println(enemy.getName()+ enemy.getHealth() + "HP remaining");

if(enemy.getHealth() > 0){

    System.out.println(enemy.getName() + " attacks");

kb.nextLine(); //enter to attack

enemy.attackCharacter(character);

System.out.println(character.getName()+ character.getHealth() + "HP remaining");
}
    } else {
//If the enemy attacks first

System.out.println(enemy.getName() + "Attacks First🗡️");

kb.nextLine(); //enter to attack;

enemy.attackCharacter(c);

System.out.println(character.getName()+ character.getHealth() + "HP remaining");
    
if(character.getHealth() > 0){

    System.out.println(character.getName() + " attacks");

kb.nextLine(); //enter to attack

character.attackEnemy(e);

System.out.println(enemy.getName()+ enemy.getHealth() + "HP remaining");



    }
}
    }
    //winner!!
   if(enemy.getHealth() <= 0){
System.out.println(character.getName() + "is the winner!!🥇🏆🥇🏆🥇🏆");

   } else {
System.out.println(enemy.getName() + "is the winner!!🥇🏆🥇🏆🥇🏆");

   }
}
}
    



    

