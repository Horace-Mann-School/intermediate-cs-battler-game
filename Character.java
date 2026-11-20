
public class Character {

    private String name;
    private int health;
    private boolean isAlive;
    private double height;
    private int level;
    private String type;
    private int attack;
    private int speed;
    private boolean isLegendary;

    // Constructor
    public Character(String name, int health,
            double height, int level, String type, int attack, int speed, boolean isLegendary) {
        setName(name);
        setHealth(health);
        setHeight(height);
        setLevel(level);
        setType(type);
        setAttack(attack);
        setSpeed(speed);
        this.isLegendary = true;
    }

    //mutators and accessors
    public int getAttack() {
        return attack;
    }
    public int getHealth() {
        return health;
    }
    public double getHeight() {
        return height;
    }
    public int getLevel() {
        return level;
    }
    public String getName() {
        return name;
    }
    public String getType() {
        return type;
    }
    public boolean getisAlive(){
        return isAlive;
    }
    public int getSpeed() {
    return speed;
    }
    public boolean getisLegendary() {
    return isLegendary;
}
    private void validateNonNegative(int num){
        if(num<0) {
            throw new IllegalArgumentException("number cannot be negative : " + num);
        }
    }

    private void validateNotNull(String x){
        if(x == " " || x == null || x == "") {
            throw new IllegalArgumentException("string cannot be null : " + x);
        }
    }

    public void setAttack(int attack) {
        validateNonNegative(attack);
        this.attack = attack;
    }
    public void setHealth(int health) {
    validateNonNegative(health);
    this.health = health;
    isAlive = health > 0;
}
    public void setHeight(double height) {
        if(height < 0) {
            throw new IllegalArgumentException("number cannot be negative : " + height);
        }
        this.height = height;
    }
    public void setLevel(int level) {
        validateNonNegative(level);
        this.level = level;
    }
    public void setName(String name) {
        validateNotNull(name);
        this.name = name;
    }
    public void setType(String type) {
        validateNotNull(type);
        this.type = type;
    }

    public void attackEnemy(Enemy x){
        int attack = getAttack();
        int charhealth = x.getHealth();
        charhealth -= attack;
        if(charhealth < 0){
            charhealth = 0;
        }
        x.setHealth(charhealth);
    }
    public void setSpeed(int speed) {
    validateNonNegative(speed);
    this.speed = speed;
}
public void setisLegendary(boolean legendary) {
    if (speed > 50) {
        isLegendary = true;
    } else {
        isLegendary = false;
    }
}

public String toString() {
    return "\n"
            + "+---------------------------------------+\n"
            + "|           CHARACTER PROFILE \t\t|\n"
            + "+---------------------------------------+\n"
            + "|\t\t\t\t\t|\n"
            + "|🔷Name:      " + name + "\t\t\t|\n"
            + "|🔥Type:      " + type + "\t\t\t|\n"
            + "|📊Level:     " + level + "\t\t\t|\n"
            + "|💎Rarity:    " + (isLegendary ? "LEGENDARY\t\t\t|" : "NORMAL\t\t\t|") + "\n"
            + "|\t\t\t\t\t|\n"
            + "+---------------------------------------+\n"
            + "|            Vital Statistics\t\t|\n"
            + "+---------------------------------------+\n"
            + "|🔋Health:    " + health + "HP\t\t\t|\n"
            + "|✅Status:    " + (isAlive ? "ALIVE\t\t\t|" : "DEFEATED\t\t\t|") + "\n"
            + "|📏Height:    " + height + "m\t\t\t|\n"
            + "|🥊Attack:    " + attack + "\t\t\t|\n"
            + "|🏃Speed:     " + speed + "\t\t\t|\n"
            + "+---------------------------------------+\n";
    }



}

