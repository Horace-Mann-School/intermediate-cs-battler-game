public class Character {
    String name; //delete your name and the equals sign later
    int level = 1;
    double health = 1.5;
    double attack = 1.2;
    double defense = 5.2;
    boolean hasFainted = true;
    



    public Character(String n) {
        name = n;
    
    }

    public String toString () {
        return "\n😊\t " + name + 
        "\nCharacter Class\n" +"\nLevel:"
         + level + "\nHealth❤️‍🩹:" + health
         + "\nAttack🗡️: " + attack
        + "\nDefense🛡️:" + defense
         + "\nFaint Status: " + hasFainted;
         


    }

}
