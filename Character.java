import java.io.Serializable;
public class Character implements Serializable {
    private String race;
    private String name;
    private static int level;
    private int health;
    //private int strength;
    //private int defense;

    public Character (String race, String name){
        this.race = race;
        this.name = name;
        level=0;

    }
    public void assign () {
        switch (race) {
            case "":
        }
    }
    public String raiseLevel() {
        level++;       
        return "Congrats! Your level is now "+level;

    }
    public String getCharacter() {
        return "Your character " +name +" is a " +race;
    }
}