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
