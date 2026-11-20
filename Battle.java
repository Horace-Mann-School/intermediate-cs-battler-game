import java.util.Scanner;

public class Battle {
    private Scanner kb;

    public Battle(){
        kb = new Scanner(System.in);
    }

    public void scannerTest() {
        System.out.print("Proceed battle? ");
        String option = kb.nextLine();
        System.out.print("Answer entered was: " + option);
    }


    public void battlePokemon(Enemy enemy, Character character){
    int cspeed = character.getSpeed();
    int espeed = enemy.getSpeed();
    String[] ecbar = {"🟩🟩🟩🟩🟩", "🟩🟩🟩🟩", "🟨🟨🟨", "🟥🟥", "🟥"};
    System.out.println("|Go, " + character.getName() + "! \t\t\t\t|Go, " + enemy.getName() + "!");
    System.out.println("|\t\t\t\t\t\t|\n|💎Character Health: " + character.getHealth() + "\t\t\t|👻Enemy Health: " + enemy.getHealth() + "\n🟩🟩🟩🟩🟩\t\t\t\t\t🟩🟩🟩🟩🟩");
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
        int i = 0;
        int j = 0;
    if(character.getHealth() >= 80){
        i = 0;
    } else if(character.getHealth() >= 60){
        i = 1;
    } else if(character.getHealth() >= 40){
        i = 2;
    } else if(character.getHealth() >= 20) {
        i = 3;
    } else if(character.getHealth() >= 0){
        i = 4;
    }

    if(enemy.getHealth() >= 80){
        j = 0;
    } else if(enemy.getHealth() >= 60){
        j = 1;
    } else if(enemy.getHealth() >= 40){
        j = 2;
    } else if(enemy.getHealth() >= 20) {
        j = 3;
    } else if(enemy.getHealth() >= 0){
        j = 4;
    }
        if(ecbar[i]=="🟩🟩🟩🟩🟩" || ecbar[i] == "🟩🟩🟩🟩"){
        System.out.println("\n|💎Character Health: " + character.getHealth() + "\t\t\t\t|👻Enemy Health: " + enemy.getHealth() + "\n" + ecbar[i] +"\t\t\t\t\t" + ecbar[j]);
        System.out.println("STATUS: " + (character.getisAlive() ? "✅ALIVE\t\t\t\t\t|" : "💀DEFEATED\t\t\t|") + "STATUS: " + (enemy.getisAlive() ? "✅ALIVE\t\t\t\t\t" : "💀DEFEATED\t\t\t"));
        }else{
        System.out.println("\n|💎Character Health: " + character.getHealth() + "\t\t\t\t|👻Enemy Health: " + enemy.getHealth() + "\n" + ecbar[i] +"\t\t\t\t\t\t" + ecbar[j]);
        System.out.println("STATUS: " + (character.getisAlive() ? "✅ALIVE\t\t\t\t\t|" : "💀DEFEATED\t\t\t\t|") + "STATUS: " + (enemy.getisAlive() ? "✅ALIVE\t\t\t\t\t" : "💀DEFEATED\t\t\t"));
        }
        scannerTest();
        if(character.getHealth() <= 0){
            System.out.println("\nYOU LOSE!! 👿 \n🌟🌟🌟🌟🌟🌟🌟🌟THE WINNER IS: " + enemy.getName()+ "!🌟🌟🌟🌟🌟🌟🌟🌟");
                return;
        }else if(enemy.getHealth() <=0){
            System.out.println("\nYOU WIN!! 🏆\n🌟🌟🌟🌟🌟🌟🌟🌟THE WINNER IS: " + character.getName() + "!🌟🌟🌟🌟🌟🌟🌟🌟");
            return;
        }
    }
    }

}
   