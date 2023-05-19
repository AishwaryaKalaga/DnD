import java.util.Scanner;
public class Main{
    public static void main (String[] args){
        //add scanner
        Scanner scan = new Scanner(System.in);

        //Introduction
        System.out.println("Welcome to Dungeons and Dragons!");
        System.out.println("Are you ready to start your quest? y/n");
        String response = scan.nextLine();
        boolean ans = true;
        while(ans){
            if (response.equals("y")){
                ans = false;
                //Character selection, switch statments
                System.out.println("Pick your character:");
                System.out.println("bard");
                System.out.println("fighter");
                System.out.println("mage");
                System.out.println("wizard");
                System.out.println("rogue");
                String character = scan.nextLine();

                switch(character){
                    case "bard":
                        System.out.println("You selected bard!");
                        break;
                    case "fighter":
                        System.out.println("You selected fighter!");
                        break;
                    case "mage":
                        System.out.println("You selected mage!");
                        break;
                    case "wizard":
                        System.out.println("You selected wizard!");
                        break;
                    default:
                        System.out.println("You have been assigned rogue");
                        break;
                }

            }
            else if (response.equals("n")){
                ans = false;
                System.out.println("End of program");
                break;
            }
            else{
                System.out.println("Oops! It looks like that didn't match y/n. Try again.");
                response = scan.nextLine();
            }
        }
        
        //to prevent resouce leaks
        scan.close();
    }
}