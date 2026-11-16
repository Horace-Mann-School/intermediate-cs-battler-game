import java.util.Scanner;

public class Battle {
    private Scanner kb;
    public Battle() {
        kb = new Scanner(System.in);
    }

    public void battle(Character c, Enemy e) {
        int c_speed = c.getSpeed();
        int e_speed = e.getSpeed();

        int c_health = c.getHealth();
        int e_health = e.getHealth();

        int c_attack = c.getAttack();
        int e_attack = e.getAttack();

        int firstAttacker = (int)(Math.random()+1);

        while (c_health > 0 && e_health > 0) {
            c_health = c.getHealth();
            e_health = e.getHealth();
            if (c_speed > e_speed) {
                //player's attack
                System.out.print("Enter an attack option: ");
                int attack = kb.nextInt();
                e.setHealth(e_health - (int)((Math.random()+0.5)*c_attack));

                //enemy's attack
                c.setHealth(c_health - (int)((Math.random()+0.5)*e_attack));
            } else if (e_speed > c_speed) {
                //enemy's attack
                c.setHealth(c_health - (int)((Math.random()+0.5)*e_attack));

                //player's attack
                System.out.print("Enter an attack option: ");
                int attack = kb.nextInt();
                e.setHealth(e_health - (int)((Math.random()+0.5)*c_attack));
            } else {
                if (firstAttacker == 1) {
                    //player's attack
                    System.out.print("Enter an attack option: ");
                    int attack = kb.nextInt();
                    e.setHealth(e_health - (int)((Math.random()+0.5)*c_attack));

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
            }
        }
    }
}