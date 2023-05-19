import java.io.Serializable;
public class Character implements Serializable {
    private String race;
    private String name;
    private int level;
    private int health;
    private int strength;
    private int defense;

    public Character(){
        race = null;
        name = null;
        level = 1;
        health = 0;
        strength = 0;
        defense = 0;
    }

    public String Character (String race, Stringname){
        this.race = race;
        this.name = name;
        getLevel();



    }
    public String raiseLevel() {
        level=1;       
        return "Congrats! Your level is now "+level;

    }
}