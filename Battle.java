import java.util.Scanner;

public class Battle {
    private Character character;
    private Enemy enemy;

    int cspeed = character.getSpeed();
    int espeed = enemy.getSpeed();
    
    if(cspeed > espeed){

    }else if(espeed > cspeed){

    }else{
    
    }


    Scanner sc = new Scanner(System.in);

    public Battle(Character character, Enemy enemy) {
        this.character = character;
        this.enemy = enemy;
    }

}

   