public class Character {

    //fields
    private String name;
    private int health;
    private int attack;
    private int defense;
    private int speed;
    private String type;

    //constructor
    public Character(String n, int hp, int atk, int def, int spd, String ty) {
        name = n;
        health = hp;
        attack = atk;
        defense = def;
        speed = spd;
        type = ty;
    }

    public String toString() {
        return "Name: " +  name + 
        ", Health: " + health + 
        ", Attack: " + attack + 
        ", Defense: " + defense + 
        ", Speed: " + speed + 
        ", Type: " + type;
    }
}
