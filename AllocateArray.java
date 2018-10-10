/*Write a program that allocates array of N integers, initializes each element by its 
index multiplied by 5 and the prints the obtained array on the console.*/

import java.util.Scanner;

public class AllocateArray {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());

        for (int i = 0; i < n; i++) {
            System.out.println(i * 5);
        }
    }
}
