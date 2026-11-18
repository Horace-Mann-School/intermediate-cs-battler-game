import java.util.Scanner;

public class Battle {
    private Scanner kb;

    public Battle(){
        kb = new Scanner(System.in);
    }

    public void scannerTest() {
        System.out.print("Enter an option: ");
        String option = kb.nextLine();
        //System.out.print("Option entered was " + option);
    }


    public void battlePokemon(Enemy enemy, Character character){
    int cspeed = character.getSpeed();
    int espeed = enemy.getSpeed();
    String cBar = "🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩";
    String eBar = "🟩🟩🟩🟩🟩🟩🟩🟩🟩🟩";
    System.out.println("|Go, " + character.getName() + "! \t\t\t\t|Go, " + enemy.getName() + "!");
    System.out.println("|\t\t\t\t\t\t|\n|💎Character Health: " + character.getHealth() + "\t\t\t|👻Enemy Health: " + enemy.getHealth());
    while(character.getHealth() >= 0 && enemy.getHealth() >=0){
    if(cspeed > espeed){
        Runner.attackEnemy(enemy, character);
        Runner.attackCharacter(enemy, character);
        }else if(espeed > cspeed){
            Runner.attackCharacter(enemy, character);
            Runner.attackEnemy(enemy, character);
        }else{ //Math.random refers to random in math class
            if(Math.random() > 0.5){
                Runner.attackEnemy(enemy, character);
                Runner.attackCharacter(enemy, character);
            }else{
                Runner.attackCharacter(enemy, character);
                Runner.attackEnemy(enemy, character);
            }
        }
    if(character.getHealth() <= 80){
        //make it so that health bar updates
    }
    
        System.out.println("\n|💎Character Health: " + character.getHealth() + "\t\t\t\t|👻Enemy Health: " + enemy.getHealth());
        scannerTest();
        if(character.getHealth() <= 0){
            System.out.println("YOU LOSE!! 👿 \n🌟🌟🌟🌟🌟🌟🌟🌟THE WINNER IS: " + enemy.getName()+ "!🌟🌟🌟🌟🌟🌟🌟🌟");
                return;
        }else if(enemy.getHealth() <=0){
            System.out.println("YOU WIN!! 🏆\n🌟🌟🌟🌟🌟🌟🌟🌟THE WINNER IS: " + character.getName() + "!🌟🌟🌟🌟🌟🌟🌟🌟");
            return;
        }
    }
    }

}

   