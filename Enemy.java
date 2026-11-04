public class Enemy {
    
     private String enemName;
     private int enemHealth;
     private boolean enemIsAlive;
     private double enemHeight;
     private int enemLevel;
     private String enemType;
     private int enemAttack;

        //Constructor
    public Enemy(String enemName, int enemHealth, boolean enemIsAlive,
        double enemHeight, int enemLevel, String enemType, int enemAttack){
            this.enemName = enemName;
            this.enemHealth = enemHealth;
            this.enemIsAlive = enemIsAlive;
            this.enemHeight = enemHeight;
            this.enemLevel = enemLevel;
            this.enemType = enemType;
            this.enemAttack = enemAttack;
        
        }


    public String toString() {
    return "\n"
            + "+--------------------------------------+\n"
            + "|           ENEMY PROFILE!          |\n"
            + "+--------------------------------------+\n"
            + "|                                      |\n"
            + "|  NAME:      " + enemName + "\n"
            + "|  TYPE:     " + enemType + "\n"
            + "|  LEVEL:     " + enemLevel + "\n"
            + "|                                      |\n"
            + "+--------------------------------------+\n"
            + "|            Vital Statistics             |\n"
            + "+--------------------------------------+\n"
            + "|  HEALTH:    " + enemHealth + " HP\n"
            + "|  STATUS:    " + (enemIsAlive ? "ALIVE" : "DEFEATED") + "\n"
            + "|  HEIGHT:    " + enemHeight + " ft\n"
            + "|  ATTACK:    " + enemAttack + "\n"
            + "+--------------------------------------+\n";
    }

    //getter and setter for enemy name
    public String getEnemName(){
        return this.enemName;
    }
    public void setEnemName(String _enemName){
        this.enemName = _enemName;
    }


    //getter and setter for enemy type
    public String getEnemType(){
        return this.enemType;
    }
    public void setEnemType(String _enemType){
        this.enemType = _enemType;
    }
    

    //getter and setter for enemy level
    public int getEnemLevel(){
        return this.enemLevel;
    }
    public void setEnemLevel(int _enemLevel){
        if(_enemLevel>=0){
        this.enemLevel = _enemLevel;
        }
    }


    //getter and setter for enemyHealth
    public int getEnemHealth(){
        return this.enemHealth;
    }
    public void setEnemHealth(int _enemHealth){
        if(_enemHealth>=0){
        this.enemHealth = _enemHealth;
        }
    }


    //getter and setter for enemy height
    public double getEnemHeight(){
        return this.enemHeight;
    }
    public void setEnemHeight(double _enemHeight){
        if(_enemHeight>=0){
        this.enemHeight = _enemHeight;
        }
    }


    //getter and setter for enemy Attack
    public int getEnemAttack(){
        return this.enemAttack;
    }
    public void setEnemAttack(int _enemAttack){
        if(_enemAttack>=0){
        this.enemAttack = _enemAttack;
        }
    }

    
}
