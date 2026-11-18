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


    public void battlePokemon(Enemy enemy, Character character){
    int cspeed = character.getSpeed();
    int espeed = enemy.getSpeed();

    while(character.getHealth() >= 0 && enemy.getHealth() >=0){
    System.out.println("\n💎Character Health: " + character.getHealth() + "\n👻Enemy Health " + enemy.getHealth()  );

    if(cspeed > espeed){
        Runner.attackEnemy(enemy, character);
        Runner.attackCharacter(enemy, character);
    }else if(espeed > cspeed){
        Runner.attackCharacter(enemy, character);
        Runner.attackEnemy(enemy, character);
    }else{
        if(Math.random() > 0.5){
            Runner.attackEnemy(enemy, character);
            Runner.attackCharacter(enemy, character);
        }else{
            Runner.attackCharacter(enemy, character);
            Runner.attackEnemy(enemy, character);
        }
    }
    scannerTest();
    }
    if(character.getHealth() <= 0){
    System.out.println("The winner is " + enemy);
    }else if(enemy.getHealth() <=0){
            System.out.println("The winner is " + character);
    }
    return;
    }

}

   