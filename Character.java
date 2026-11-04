
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
        setName(name);
        setHealth(health);
        this.isAlive = true;
        setHeight(height);
        setLevel(level);
        setType(type);
        setAttack(attack);
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
        if(health <= 0){
            this.health = 0;
            isAlive = false;
        }
        this.health = health;
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
            + "|🔋HEALTH:    " + health + "HP\t\t\t|\n"
            + "|✅STATUS:    " + (isAlive ? "ALIVE\t\t\t|" : "DEFEATED\t\t\t|") + "\n"
            + "|📏HEIGHT:    " + height + "m\t\t\t|\n"
            + "|🔪ATTACK:    " + attack + "\t\t\t|\n"
            + "+---------------------------------------+\n";
    }



}

