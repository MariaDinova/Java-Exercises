//Write a method that asks the user for his name and prints Hello, <name>!. Write a program to test this method.

import java.util.Scanner;

public class SayHello {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String name = console.nextLine();
        System.out.printf("Hello, %s!", name);
    }
}
