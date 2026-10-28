public class Character {
    int HP;
    boolean dead;
    int Attack;
    int Defense;
    String PokemonType;
    String Name;

    Character (String name, int hp, int attack, int defense, String type, boolean die){
        this.Name = name;
        this.HP = hp;
        this.Attack = attack;
        this.Defense = defense;
        this.PokemonType = type;
        this.dead = die;

    }

    public String toString(){
        return "Name: " + Name +
        ", Health: " + HP +
        ", Attack: " + Attack +
        ", Defense: " + Defense +
        ", Type: " + PokemonType +
        ", Dead: " + dead;
    }
}
