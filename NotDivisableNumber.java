/*Write a program that reads from the console a positive integer N and prints all the numbers 
from 1 to N not divisible by 3 or 7, on a single line, separated by a space.*/

import java.util.Scanner;

public class NotDivisableNumber {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());

        for (int i = 1; i <= n; i++) {
            if (i%3 != 0 && i%7 !=0){
                System.out.print(i + " ");
            }
        }
    }
}
