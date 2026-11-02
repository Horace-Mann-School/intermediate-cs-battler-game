public class Enemy {
     private String ename;
    private int ehealth;
    private boolean eisAlive;
    private double eheight;
    private int elevel;
    private String etype;
    private int eattack;
    private boolean eisLegendary;
 // Constructor
    public Enemy(String name, int health, boolean isAlive,
            double height, int level, String type, int attack, boolean isLegendary) {
        this.ename = name;
        this.ehealth = health;
        this.eheight = height;
        this.elevel = level;
        this.etype = type;
        this.eattack = attack;
        this.eisLegendary = isLegendary;
    }


public String toString() {
    return "\n"
            + "+---------------------------------------+\n"
            + "|           ENEMY PROFILE \t\t|\n"
            + "+---------------------------------------+\n"
            + "|\t\t\t\t\t|\n"
            + "|🔷NAME:      " + ename + "\t\t\t|\n" 
            + "|🔥TYPE:      " + etype + "\t\t\t|\n"           
            + "|🌊LEVEL:     " + elevel + "\t\t\t|\n"
            + "|💎RARITY:    " + (eisLegendary ? "LEGENDARY\t\t\t|" : "NORMAL\t\t\t|") + "\n"

            + "|\t\t\t\t\t|\n"
            + "+---------------------------------------+\n"
            + "|            Vital Statistics\t\t|\n"
            + "+---------------------------------------+\n"
            + "|🔋HEALTH:    " + ehealth + "HP\t\t\t|\n"
            + "|✅STATUS:    " + (eisAlive ? "ALIVE\t\t\t|" : "DEFEATED\t\t\t|") + "\n"
            + "|📏HEIGHT:    " + eheight + "m\t\t\t|\n"
            + "|🔪ATTACK:    " + eattack + "\t\t\t|\n"
            + "+---------------------------------------+\n";
    }



}

