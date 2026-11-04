
public class Character {
    private String name;
    private int health;
    private boolean isAlive;
    private double height;
    private int level;
    private String type;
    private int attack;

    // Constructor
    public Character(String name, int health, boolean isAlive,
            double height, int level, String type, int attack) {
        setName(name);
        setHealth(health);
        setAlive(isAlive);
        setHeight(height);
        setLevel(level);
        setType(type);
        setAttack(attack);
    }

    // Accessors
    public String getName() { return name; }
    public int getHealth() { return health; }
    public boolean getIsAlive() { return isAlive; }
    public double getHeight() { return height; }
    public int getLevel() { return level; }
    public String getType() { return type; }
    public int getAttack() { return attack; }

    // Mutators
    public void setName(String name) {
        this.name = name;
    }

    public void setHealth(int health) {
        if (health >= 0) {
            this.health = health;
        }
    }

    public void setAlive(boolean isAlive) {
        this.isAlive = isAlive;
    }

    public void setHeight(double height) {
        if (height >= 0) {
            this.height = height;
        }
    }

    public void setLevel(int level) {
        if (level >= 0) {
            this.level = level;
        }
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setAttack(int attack) {
        if (attack >= 0) {
            this.attack = attack;
        }
    }

    public String toString() {
        return "\n"
                + "+--------------------------------------+\n"
                + "|          Character Profile 👤         \n"
                + "+--------------------------------------+\n"
                + "|                                      \n"
                + "|  📇NAME:      " + name + "\n"
                + "|  📌TYPE:     " + type + "\n"
                + "|  📊LEVEL:     " + level + "\n"
                + "|                                      \n"
                + "+--------------------------------------+\n"
                + "|           Vital Statistics 📉          \n"
                + "+--------------------------------------+\n"
                + "|  🔋HEALTH:    " + health + " HP\n"
                + "|  ✅STATUS:    " + (isAlive ? "ALIVE" : "DEFEATED") + "\n"
                + "|  📏HEIGHT:    " + height + " ft\n"
                + "|  🥊ATTACK:    " + attack + "\n"
                + "+--------------------------------------+\n";
    }


// character attack method
public void characterAttack(Enemy enemy) {
    if (health > 0 && enemy.getHealth() > 0) {
        enemy.setHealth(enemy.getHealth() - attack);
    }

    if (enemy.getHealth() == 0) {
        enemy.setDead(true);
    }
}
    
}
