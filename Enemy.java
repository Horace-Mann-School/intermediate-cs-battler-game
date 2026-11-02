
public class Enemy {
    String name;
    int health;
    boolean isDead;
    double height;
    int level;
    String type;
    int attack;

    // Constructor
    public Enemy(String name, int health, boolean isDead,
            double height, int level, String type, int attack) {
        this.name = name;
        this.health = health;
        this.isDead = isDead;
        this.height = height;
        this.level = level;
        this.type = type;
        this.attack = attack;
    }


public String toString() {
    return "\n"
            + "+--------------------------------------+\n"
            + "|           Enemy Profile 👹          |\n"
            + "+--------------------------------------+\n"
            + "|                                      |\n"
            + "|  📇NAME:      " + name + "\n"
            + "|  📌TYPE:     " + type + "\n"
            + "|  📊LEVEL:     " + level + "\n"
            + "|                                      |\n"
            + "+--------------------------------------+\n"
            + "|           Vital Statistics 📈            |\n"
            + "+--------------------------------------+\n"
            + "|  🔋HEALTH:    " + health + " HP\n"
            + "|  ✅STATUS:    " + (isDead ? "DEFEATED" : "ALIVE") + "\n"
            + "|  📏HEIGHT:    " + height + " ft\n"
            + "|  🥊ATTACK:    " + attack + "\n"
            + "+--------------------------------------+\n";
            
    }


}


