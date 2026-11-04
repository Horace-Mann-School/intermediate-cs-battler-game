public class Enemy {
        private String name;
    private int health;
    private boolean isAlive;
    private double height;
    private int level;
    private String type;
    private int attack;

    // Constructor
    public Enemy(String name, int health, boolean isAlive, double height, int level, String type, int attack) {
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
        if (name != null && name != "") {
            this.name = name;
        } else {
            throw new IllegalAccessError("name cannot be " + name + ". input a string!");
        }
    }

    public int getHealth() {
        return this.health;
    }
    public void setHealth(int health) {
        if (health >= 0) {
            this.health = health;
        } else {
            throw new IllegalAccessError("health cannot be a negative number: " + health);
        }
    }

    public boolean getAlive() {
        return this.isAlive;
    }
    public void setAlive(boolean isAlive) {
        if (isAlive == true || isAlive == false) {
            this.isAlive = isAlive;
        } else {
            throw new IllegalAccessError("isAlive cannot be " + isAlive + ". input a boolean!");
        }
    }

    public double getHeight() {
        return this.height;
    }
    public void setHeight(double height) {
        if (height > 0) {
            this.height = height;
        } else {
            throw new IllegalAccessError("height cannot be " + height + ". input doubles greater than 0!");
        }

    }

    public int getLevel() {
        return this.level;
    }
    public void setLevel(int level) {
        if (level >= 0) {
            this.level = level;
        } else {
            throw new IllegalAccessError("level cannot be a negative number: " + level);
        }
    }

    public String getType() {
        return this.type;
    }
    public void setType(String type) {
        if (type != null && type != "") {
            this.type = type;
        } else {
            throw new IllegalAccessError("type cannot be " + type + ". input a string!");
        }
    }

    public int getAttack() {
        return this.attack;
    }
    public void setAttack(int attack) {
        if (attack >= 0) {
            this.attack = attack;
        } else {
            throw new IllegalAccessError("attack cannot be a negative number: " + attack);
        }
    }
}
