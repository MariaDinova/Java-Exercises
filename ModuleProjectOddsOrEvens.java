/*For this project you are going to program a game called "Odds and Evens". 
The game is similar to rock paper scissors. It is played between two players, in your version it will be you 
versus the computer. Each player will choose either "odds" or "evens", since you’re playing the computer you 
will get first pick. Once you have chosen your side, you each choose a number of fingers to play- 0 to 5. 
The winner is determined by whether the sum of your fingers is odd or even (depending on what you chose). 
Here's a clip of the game being played: https://youtu.be/4ZOLs03vILs?t=1m

For example, let’s say you choose "evens". That means the computer gets "odds". You choose to play 2 fingers 
and the computer plays 3. 2 + 3 = 5, which is odd so the computer wins.*/

import java.util.Random;
import java.util.Scanner;

public class ModuleProjectOddsOrEvens {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        // choice odd or even
        System.out.println("Let’s play a game called “Odds and Evens”");
        System.out.print("What is your name?");
        String name = console.next();
        System.out.printf("Hi %s, which do you choose? (O)dds or (E)vens?", name);
        String choice = console.next();
        if (choice.equals("O")){
            System.out.printf("%s has picked odds! The computer will be evens.", name);
        }
        else {
            System.out.printf("%s has picked evens! The computer will be odds.", name);
        }
        System.out.println();

        // add chars
        for (int i = 0; i < 39; i++) {
            System.out.print("-");
        }
        System.out.println();

        //play the game
        System.out.print("How many “fingers” do you put out?");
        int playerFingers = console.nextInt();
        Random rand = new Random();
        int computerFingers = rand.nextInt(6);
        System.out.println("The computer plays " + computerFingers +  " \"fingers\".");

        //add chars
        for (int i = 0; i < 39; i++) {
            System.out.print("-");
        }
        System.out.println();

        //calculating results
        int sum = playerFingers + computerFingers;
        System.out.println(playerFingers + " + " + computerFingers + " = " + sum);
        boolean sumIsEven = sum % 2 == 0;
        boolean sumIsOdd = sum % 2 != 0;
        if (sumIsEven){
            System.out.println(sum + " is...even");
        }
        else {
            System.out.println(sum + " is...odd");
        }
        if ((sumIsEven && playerFingers % 2 == 0) || sumIsOdd && playerFingers % 2 != 0){
            System.out.println("That means " + name + " wins! :)");
        }
        else if ((sumIsEven && computerFingers % 2 == 0) || sumIsOdd && computerFingers % 2 != 0){
            System.out.println("That means computer wins! :)");
        }
    }
}
