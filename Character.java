public class Character {
    String name;
    int health;
    double rating;
    boolean hasFainted;
    int shieldsLeft;
    int attackStrength;

    public Character(String n, int h, double r, int sL, int aS){ // constructors dont have return types, even void
        this.name = n;
        this.health = h;
        this.rating = r;
        this.hasFainted = false;
        this.shieldsLeft = sL;
        this.attackStrength = aS;
    }

    public String toString() {
        return "🌙\tCharacter Name: " + name + "\n🍎\tCharacter HP: " + health + "\n🌟\tCharacter Rating: " + rating + "";
    }
}
