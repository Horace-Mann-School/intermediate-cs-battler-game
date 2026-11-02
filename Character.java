public class Character {
    private String name;
    private int health;
    private boolean isAlive;
    private double height;
    private int level;
    private String type;
    private int attack;

    // Constructor
    public Character(String name, int health, boolean isAlive, double height, int level, String type, int attack) {
        setName(name);
        setHealth(health);
        setAlive(isAlive);
        setHeight(height);
        setLevel(level);
        setType(type);
        setAttack(attack);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
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