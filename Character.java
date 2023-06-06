public class Character {
    private String race;
    private String name;
    private static int level;
    private int health;


    public Character (String race, String name){
        this.race = race;
        this.name = name;
        level=1;
        switch (race) {
            case "fighter":
                health=100;
                break;
            case "bard":
                health=90;
                break;
            case "ranger":
                health=75;
                break;
            case "wizard":
                health=50;
                break;  
            default :
                health=120;
                break;
        }
        health=level*(health/5);
    }
    public int getHealth (Character c) {
        return health;
    }

    public String raiseLevel(Character c) {
        level++;       
        return "Congrats! Your level is now "+level;
    }

    public String getCharacter(Character c) {
        return "Your character " +name +" is a " +race;
    }
}