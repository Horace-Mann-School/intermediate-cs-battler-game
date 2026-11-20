import java.util.Scanner;

public class Battle {
    private Scanner kb;
    public Battle() {
        kb = new Scanner(System.in);
    }

    //battle method
    public void battle(Character c, Enemy e) {
        int turn = 1;   //when turn equals 1 player goes first and when 2 enemy goes first

        int c_speed = c.getSpeed();
        int e_speed = e.getSpeed();

        int c_health = c.getHealth();
        int e_health = e.getHealth();

        System.out.println(c_health);
        System.out.println(e_health);

        //battle loop
        while (c_health > 0 && e_health > 0) {
            if (c_speed > e_speed) {
                turn = 1;
            } else if (e_speed > c_speed) {
                turn = 0;
            } else {
                turn = (int)(Math.random());
            }

            if (turn == 1) {
                System.out.print("Enter an attack option: ");
                String attack = kb.nextLine();
                c.attackEnemy(e);

                e.attackCharacter(c);
            } else {
                e.attackCharacter(c);

                System.out.print("Enter an attack option: ");
                String attack = kb.nextLine();
                c.attackEnemy(e);
            }
            c_health = c.getHealth();
            e_health = e.getHealth();
            
            System.out.println(c_health);
            System.out.println(e_health);
        }
    }
}