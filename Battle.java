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

        int c_attack = c.getAttack();
        int e_attack = e.getAttack();

        System.out.println(c_health);
        System.out.println(e_health);

        //battle loop
        while (c_health > 0 && e_health > 0) {
            c_health = c.getHealth();
            e_health = e.getHealth();

            if (c_speed > e_speed) {
                turn = 1;
            } else if (e_speed > c_speed) {
                turn = 0;
            } else {
                turn = (int)(Math.random());
            }

            if (turn == 1) {
                //player's attack
                System.out.print("Enter an attack option: ");
                int attack = kb.nextInt();
                e.setHealth(e_health - (int)((Math.random()+0.5)*c_attack));    //these 4 randoms just randomize the attacks dealt

                //enemy's attack
                c.setHealth(c_health - (int)((Math.random()+0.5)*e_attack));
            } else {
                //enemy's attack
                c.setHealth(c_health - (int)((Math.random()+0.5)*e_attack));

                //player's attack
                System.out.print("Enter an attack option: ");
                int attack = kb.nextInt();
                e.setHealth(e_health - (int)((Math.random()+0.5)*c_attack));
            }
            if (c_health < 0) {
                c.setHealth(0);
            }
            if (e_health < 0) {
                e.setHealth(0);
            }
            System.out.println(c_health);
            System.out.println(e_health);
        }
    }
}