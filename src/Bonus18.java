import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

public class Bonus18 {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        System.out.println("Welcome! What is your name?");
        String playerName = scnr.next();

        System.out.println("Would you like to play a game? yes or no?");
        String playTheGame = scnr.next();
        if (playTheGame.equalsIgnoreCase("yes")) {
            System.out.println("Excellent! You are walking across a field and you encounter a " +
                    "fire-breathing dragon! What would you do? Please enter 'fight' or " +
                    "'run'");
            String whatDoYouDo = scnr.next();
            if (whatDoYouDo.equalsIgnoreCase("fight")){
                System.out.println("You approach the dragon. You see that he has __ head(s). Does he have 1, 2, or 3?");
                int numHeads = scnr.nextInt();
                if (numHeads == 1){
                    System.out.println("Oh, only 1 head you say? Defeating him will be a piece of cake! Choose your weapon. " +
                            "Do you want a slingshot, sword, or bow?");
                }
                else {
                    System.out.println("No one has ever faced a " + numHeads + " headed dragon before! Choose your weapon. " +
                            "Do you want a slingshot, sword, or bow?");
                }
                String weapon = scnr.next();
                System.out.println("Armed with your " + weapon + " you approach the dragon. You can feel its fiery breath " +
                        "as you get closer. It stares at you with its eyes. Are they red or blue?");
                String eyeColor = scnr.next();
                System.out.println("Oh thank goodness! " + eyeColor + "-eyed dragons are friendly. You pet it and become " +
                        "friends. What will you name your new dragon friend?");
                String dragonName = scnr.next();
                System.out.println(playerName + " and " + dragonName + " live happily ever after. The end!");
            }
            if (whatDoYouDo.equalsIgnoreCase("run")){
                System.out.println("What?? You ran away?? Fine, see you later!");
            }
        } else if (playTheGame.equalsIgnoreCase("no")) {
            System.out.println("You're no fun! Oh well, see you later!");
        }
    }
}
