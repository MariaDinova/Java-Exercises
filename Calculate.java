/*Write a program that, for a given two numbers N and x, calculates the sum S = 1 + 1!/x + 2!/x2 + … + N!/xN.

Use only one loop. Print the result with 5 digits after the decimal point.*/

import java.util.Scanner;

public class Calculate {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        double n = Double.parseDouble(console.nextLine());
        double x = Double.parseDouble(console.nextLine());
        double sum = 1;
        double fact = 1;

        for (int i = 1; i <= n; i++) {
            fact *= i;
            sum = sum + fact/Math.pow(x, i);
        }
        System.out.printf("%.5f", sum);
    }
}
