
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
        setName(name);
        setHealth(health);
        setIsAlive(isAlive);
        setHeight(height);
        setLevel(level);
        setType(type);
        setAttack(attack);
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


    //getter and setter for name
    public String getName(){
        return this.name;
    }
    public void setName(String _name){
        this.name = _name;
    }


    //getter and setter for type
    public String getType(){
        return this.type;
    }
    public void setType(String _type){
        this.type = _type;
    }

    //getter and setter for isAlive
    public boolean getIsAlive(){
        return this.isAlive;
    }
    public void setIsAlive(boolean _isAlive){
        this.isAlive = _isAlive;
    }

    

    //getter and setter for level
    public int getLevel(){
        return this.level;
    }
    public void setLevel(int _level){
        if (_level>=0){
        this.level = _level;
        }
    }


    //getter and setter for health
    public int getHealth(){
        return this.health;
    }
    public void setHealth(int _health){
        if(_health>=0){
        this.health = _health;
        }
    }


    //getter and setter for height
    public double getHeight(){
        return this.height;
    }
    public void setHeight(double _height){
        if(_height>=0){
        this.height = _height;
        }
    }


    //getter and setter for Attack
    public int getAttack(){
        return this.attack;
    }
    public void setAttack(int _attack){
        if(_attack>=0){
        this.attack = _attack;
        }
    }


}

