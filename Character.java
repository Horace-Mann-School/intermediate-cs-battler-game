
public class Character {
    String name;
    int health;
    boolean isAlive;
    double height;
    int level;
    String type;
    int attack;

    // Constructor
    public Character(String name, int health, boolean isAlive,
            double height, int level, String type, int attack) {
        this.name = name;
        this.health = health;
        this.isAlive = isAlive;
        this.height = height;
        this.level = level;
        this.type = type;
        this.attack = attack;
    }


public String toString() {
    return "\n"
            + "+---------------------------------------+\n"
            + "|           CHARACTER PROFILE \t\t|\n"
            + "+---------------------------------------+\n"
            + "|\t\t\t\t\t|\n"
            + "|🔷NAME:      " + name + "\t\t\t|\n" 
            + "|🔥TYPE:      " + type + "\t\t\t|\n"           
            + "|🌊LEVEL:     " + level + "\t\t\t|\n"
            + "|\t\t\t\t\t|\n"
            + "+---------------------------------------+\n"
            + "|            Vital Statistics\t\t|\n"
            + "+---------------------------------------+\n"
            + "|💕HEALTH:    " + health + "HP\t\t\t|\n"
            + "|✅STATUS:    " + (isAlive ? "ALIVE\t\t\t|" : "DEFEATED\t\t\t|") + "\n"
            + "|📏HEIGHT:    " + height + "m\t\t\t|\n"
            + "|ATTACK:    " + attack + "\t\t\t|\n"
            + "+---------------------------------------+\n";
    }



}

