
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
            + "+--------------------------------------+\n"
            + "|           CHARACTER PROFILE!          |\n"
            + "+--------------------------------------+\n"
            + "|                                      |\n"
            + "|  NAME:      " + name + "\n"
            + "|  TYPE:     " + type + "\n"
            + "|  LEVEL:     " + level + "\n"
            + "|                                      |\n"
            + "+--------------------------------------+\n"
            + "|            Vital Statistics             |\n"
            + "+--------------------------------------+\n"
            + "|  HEALTH:    " + health + " HP\n"
            + "|  STATUS:    " + (isAlive ? "ALIVE" : "DEFEATED") + "\n"
            + "|  HEIGHT:    " + height + " ft\n"
            + "|  ATTACK:    " + attack + "\n"
            + "+--------------------------------------+\n";
    }



}

