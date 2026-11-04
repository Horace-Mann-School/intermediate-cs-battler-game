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
    public Enemy(String name, int health,
            double height, int level, String type, int attack, boolean isLegendary) {
        this.ename = name;
        this.ehealth = health;
        this.eheight = height;
        this.eisAlive = true;
        this.elevel = level;
        this.etype = type;
        this.eattack = attack;
        this.eisLegendary = isLegendary;
    }

      //mutators and accessors
    public int getAttack() {
        return eattack;
    }
    public int getHealth() {
        return ehealth;
    }
    public double getHeight() {
        return eheight;
    }
    public int getLevel() {
        return elevel;
    }
    public String getName() {
        return ename;
    }
    public String getType() {
        return etype;
    }
    public boolean getisAlive() {
        return eisAlive;
    }
    public boolean getisLegendary() {
        return eisLegendary;
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
        this.eattack = attack;
    }
    public void setHealth(int health) {
        if(health <= 0){
            this.ehealth = 0;
            eisAlive = false;
        }
        this.ehealth = health;
    }
    public void setHeight(double height) {
        if(height < 0) {
            throw new IllegalArgumentException("number cannot be negative : " + height);
        }
        this.eheight = height;
    }
    public void setLevel(int level) {
        validateNonNegative(level);
        this.elevel = level;
    }
    public void setName(String name) {
        validateNotNull(name);
        this.ename = name;
    }
    public void setType(String type) {
        validateNotNull(type);
        this.etype = type;
    }

    public void setLegendary(boolean x){
        this.eisLegendary = x;
    }
  public void attackCharacter(Character y){
        int attack = this.getAttack();
        int charhealth = y.getHealth(); 
        charhealth -= attack;
        if(charhealth < 0){
            charhealth = 0;
        }
        y.setHealth(charhealth);
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

