import java.util.Random;
import java.util.Scanner;

public class ModuleProjectBattleShips {

    public static char [][] oceanMap = new char[10][10];
    public static char [][] computerMap = new char[10][10];
    public static char [][] playerMap = new char[10][10];


    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        createMap();
        deployPlayersShip();
        deployComputersShips();
        battle();

    }

    private static void battle() {
        Scanner console = new Scanner(System.in);
        char[][] computerMap = new char[10][10];
        int computerShips = 5;
        int playerShips = 5;

        while (true){
            if (computerShips == 0 || playerShips == 0){
                break;
            }
            // player turn
            System.out.println("YOUR TURN");
            while (true){
                System.out.print("Enter X coordinate: ");
                int xCoordinate = console.nextInt();
                System.out.print("Enter Y coordinate: ");
                int yCoordinate = console.nextInt();

                if (xCoordinate <= 9 && xCoordinate >= 0
                        && yCoordinate <= 9 && yCoordinate >= 0
                        && playerMap[xCoordinate][yCoordinate] != '-'){

                    if (oceanMap[xCoordinate][yCoordinate] == '$'){
                        System.out.println("Boom! You sunk the ship!");
                        oceanMap[xCoordinate][yCoordinate] = '!';
                        computerShips --;
                    }
                    else if (oceanMap[xCoordinate][yCoordinate] == '@') {
                        System.out.println("Oh no, you sunk your own ship :(");
                        oceanMap[xCoordinate][yCoordinate] = 'x';
                        playerShips--;
                    }
                    else {
                        System.out.println("Sorry, you missed");
                        playerMap[xCoordinate][yCoordinate] = '-';
                    }
                    break;
                }
            }
            //computer turn
            System.out.println("Computer's Turn");
            while (true){
                Random rand = new Random();
                int xCoordinate = rand.nextInt(9) + 0;
                int yCoordinate = rand.nextInt(9) + 0;

                if (xCoordinate <= 9 && xCoordinate >= 0
                        && yCoordinate <= 9 && yCoordinate >= 0
                        && computerMap[xCoordinate][yCoordinate] != '-'){

                    if (oceanMap[xCoordinate][yCoordinate] == '@'){
                        System.out.println("The Computer sunk one of your ships.");
                        oceanMap[xCoordinate][yCoordinate] = 'x';
                        computerShips --;
                    }
                    else if (oceanMap[xCoordinate][yCoordinate] == '$') {
                        System.out.println("The Computer sunk one of its own ships.");
                        oceanMap[xCoordinate][yCoordinate] = '!';
                        playerShips--;
                    }
                    else {
                        System.out.println("Computer missed.");
                        computerMap[xCoordinate][yCoordinate] = '-';
                    }
                    break;
                }
            }
        }
        System.out.println("  0123456789");
        for (int row = 0; row < oceanMap.length; row++) {
            System.out.print(row + "|");
            for (int col = 0; col < oceanMap[row].length; col++) {
                if (oceanMap[row][col] == 0){
                    System.out.print(" ");
                }
                else {
                    System.out.print(oceanMap[row][col]);
                }
            }
            System.out.println("|" + row);
        }
        System.out.println("  0123456789");
        System.out.println();
        System.out.println("Your ships: " + playerShips + " | Computer ships: " + computerShips);

        if (computerShips == 0){
            System.out.println("Hooray! You win the battle :)");
        }
        else {
            System.out.println("You lose the battle :(");
        }
    }

    private static void deployComputersShips() {
        System.out.println("Computer is deploying ships");
        int counter = 0;
        Random rand = new Random();

        while (counter < 5) {
            int xCoordinate = rand.nextInt(9) + 0;
            int yCoordinate = rand.nextInt(9) + 0;

            if (xCoordinate <= 9 && xCoordinate >= 0
                    && yCoordinate <= 9 && yCoordinate >= 0
                    && oceanMap[xCoordinate][yCoordinate] != '@'
                    && oceanMap[xCoordinate][yCoordinate] != '$') {
                oceanMap[xCoordinate][yCoordinate] = '$';
                counter++;
                System.out.println(counter + ". ship DEPLOYED");
            }
        }
    }

    private static void deployPlayersShip() {
        Scanner console = new Scanner(System.in);
        System.out.println("Deploy your ships:");
        int counter = 0;

        while (counter < 5) {
            System.out.print("Enter X coordinate for your ship:");
            int xCoordinate = console.nextInt();
            System.out.print("Enter Y coordinate for your ship:");
            int yCoordinate = console.nextInt();

            if (xCoordinate <= 9 && xCoordinate >= 0
                    && yCoordinate <= 9 && yCoordinate >= 0
                    && oceanMap[xCoordinate][yCoordinate] != '@'){
                oceanMap[xCoordinate][yCoordinate] = '@';
                counter ++;
            }
            else if (xCoordinate > 9 || xCoordinate < 0
                    && yCoordinate > 9 || yCoordinate < 0){
                System.out.println("You can't place ships outside the 10 by 10 grid");
            }
            else if (oceanMap[xCoordinate][yCoordinate] == '@'){
                System.out.println("You can NOT place two or more ships on the same location");
            }
        }
        System.out.println();
        System.out.println("  0123456789");
        for (int row = 0; row < oceanMap.length; row++) {
            System.out.print(row + "|");
            for (int col = 0; col < oceanMap[row].length; col++) {
                if (oceanMap[row][col] == 0){
                    System.out.print(" ");
                }
                else {
                    System.out.print(oceanMap[row][col]);
                }
            }
            System.out.println("|" + row);
        }
        System.out.println("  0123456789");
        System.out.println();
    }

    private static void createMap() {
        System.out.println("**** Welcome to Battle Ships game ****");
        System.out.println();
        System.out.println("Right now, the sea is empty.");
        System.out.println();
        System.out.println("  0123456789");
        for (int row = 0; row < oceanMap.length; row++) {
            System.out.print(row + "|");
            for (int col = 0; col < oceanMap[row].length; col++) {
                if (oceanMap[row][col] == 0){
                    System.out.print(" ");
                }
            }
            System.out.println("|" + row);
        }
        System.out.println("  0123456789");
        System.out.println();

    }
}
