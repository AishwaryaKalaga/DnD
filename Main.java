import java.util.Scanner;
public class Main{
    public static void main (String[] args){
        //add scanner
        Scanner scan = new Scanner(System.in);

        //Introduction
        System.out.println("Welcome to Dungeons and Dragons! \nAre you ready to start your quest? y/n");
        String response = scan.nextLine();
        boolean ans = true;
        while(ans){
            if (response.equalsIgnoreCase("y")){
                ans = false;
                //Race selection, switch statments
                System.out.println("Pick your race:");
                System.out.println("bard");
                System.out.println("fighter");
                System.out.println("ranger");
                System.out.println("wizard");
                System.out.println("rogue");
                String race = scan.nextLine();

                if (!(race.equals("bard")||race.equals("fighter")||race.equals("ranger")||race.equals("wizard"))) {
                    System.out.println("You have been assigned rogue");
                    race="rougue";
                }
                else {
                    System.out.println("You have been assigned" + race);
                }

                System.out.println("What would you like to name your character?");
                String name = scan.nextLine();
                System.out.println("Your character has been named " + name);

                Character char = new Character(race, name);


            }
            else if (response.equalsIgnoreCase("n")){
                ans = false;
                System.out.println("End of program");
                break;
            }
            else{
                System.out.println("Oops! It looks like that didn't match y/n. Try again.");
                response = scan.nextLine();
            }
            
            
            
            //Start of story
            System.out.println("Would you like a happy story, or a sad one?");
            String story = scan.nextLine();
            if (story.equalsIgnoreCase("happy")){
                System.out.println("Starting happy story");
                System.out.println(raiseLevel(char));
                
            }
            else if (story.equalsIgnoreCase("sad")){

            }


        }
        
        //to prevent resouce leaks
        scan.close();
    }
}