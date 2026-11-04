
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
        this.name = name;
        this.health = health;
        this.height = height;
        this.level = level;
        this.type = type;
        this.attack = attack;
    }


    public String toString() {
        return "\n"
            + "+--------------------------------------+\n"
            + "|           CHARACTER PROFILE!          |\n"
            + "+--------------------------------------+\n"
            + "|                                      |\n"
            + "|  NAME:      " + name + "\n"
            + "|  TYPE:      " + type + "\n"
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
        public String getName() {
            return name;
        }

        public void setName(String _name) {
            Utility.validateString(_name, "name");
            name = _name;
        }

    //getter and setter for type
        public String getType() {
            return type;
        }

        public void setType(String _type) {
            Utility.validateString(_type, "type");
            type = _type;
        }

    //getter and setter for health
        public int getHealth() {
            return health;
        }

        public void setHealth(int _health) {
            if (_health < 0) {
                _health = 0;
            }
            health = _health;
        }

    //getter and setter for height
        public double getHeight() {
            return height;
        }

        public void setHeight(int _height) {
            Utility.validatePosNum(_height, "height");
            height = _height;
        }

    //getter and setter for level
        public int getLevel() {
            return level;
        }

        public void setLevel(int _level) {
            Utility.validatePosNum(_level, "level");
            level = _level;
        }

    //getter and setter for attack
        public int getAttack() {
            return attack;
        }

        public void setAttack(int _attack) {
            Utility.validatePosNum(_attack, "attack");
            attack = _attack;
        }


}

