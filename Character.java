
public class Character {
    private String name;
    private int health;
    private boolean isAlive;
    private double height;
    private int level;
    private String type;
    private int attack;

    // Constructor
    public Character(String name, int health,
            double height, int level, String type, int attack) {
        this.name = name;
        this.health = health;
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
            + "|  TYPE:      " + type + "\n"
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

    //getter and setter for name
    public String getName() {
        return name;
    }

    public void setName() {
        
    }



}

