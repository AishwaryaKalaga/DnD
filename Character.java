import java.io.Serializable;
public class Character implements Serializable {
    private String race;
    private String name;
    private static int level;
    private int health;


    public Character (String race, String name){
        this.race = race;
        this.name = name;
        level=0;
        health=0;

    }
    public void assignHealth () {
        switch (race) {
            case "fighter":
                break;
                health=100;
            case "bard":
                health=90;
                break;
            case "ranger":
                break;
                health=75;
            case "wizard":
                break;
                health=50;
            default :
                health=120;
                break;
            health=health*(level/5)
        }
    }
    public int getHealth () {
        return health;
    }

    public String raiseLevel() {
        level++;       
        return "Congrats! Your level is now "+level;

    }
    public String getCharacter() {
        return "Your character " +name +" is a " +race;
    }
}