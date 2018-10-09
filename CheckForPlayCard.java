import java.util.Scanner;

public class CheckForPlayCard {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String input = console.nextLine();

        switch (input){
            case "2":
                System.out.println("yes " + input);
                break;
            case "3":
                System.out.println("yes " + input);
                break;
            case "4":
                System.out.println("yes " + input);
                break;
            case "5":
                System.out.println("yes " + input);
                break;
            case "6":
                System.out.println("yes " + input);
                break;
            case "7":
                System.out.println("yes " + input);
                break;
            case "8":
                System.out.println("yes " + input);
                break;
            case "9":
                System.out.println("yes " + input);
                break;
            case "10":
                System.out.println("yes " + input);
                break;
            case "J":
                System.out.println("yes " + input);
                break;
            case "Q":
                System.out.println("yes " + input);
                break;
            case "K":
                System.out.println("yes " + input);
                break;
            case "A":
                System.out.println("yes " + input);
                break;
                default:
                    System.out.println("no " + input);
        }
    }
}
