public class Character {
    String name;
    double health;
    int level;
    String type;
    String weapon;
    double strength;

    public Character(String n, double hp, int l, String t, String w, double s) {
        name = n;
        health = hp;
        level = l;
        type = t;
        weapon = w;
        strength = s;
    }

    public String toString() {
        return name + " the " + type + "\t\t" + health + " ♥️\t" + "\tLvl: " + level +  "\n" + weapon + " of " + strength + " Damage";
    }
}
