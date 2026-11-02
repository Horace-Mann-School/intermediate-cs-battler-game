public class Enemy {
    
     String enemName;
     int enemHealth;
     boolean enemIsAlive;
     double enemHeight;
     int enemLevel;
     String enemType;
     int enemAttack;

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

    
}
