
 class Character {
    private String name;
    private int health;
    private boolean isAlive;
    private double height;
    private int level;
    private String type;
    private int attack;

    // Constructor
     Character(String name, int health, boolean isAlive,
            double height, int level, String type, int attack) {
        this.name = name;
        this.health = health;
        this.isAlive = isAlive;
        this.height = height;
        this.level = level;
        this.type = type;
        this.attack = attack;
        
        setHeight(height);
        setLevel(level);
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

public int setLevel(){
return this.level;

}

public void setLevel(int level){
if(level < 0) {
    throw new IllegalArgumentException("Level cannot be negative: " + level);

}
this.level = level;

}

public double setHeight(){
return this.height;

}

public void setHeight(double height){
if(height < 0) {
    throw new IllegalArgumentException("Level cannot be negative: " + height);

}
this.height = height;

}

}

