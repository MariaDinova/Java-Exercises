/*Write a program that prints on the console the border of a trapezoid by given number N.

The width of the top side of the trapezoid must be exactly N.

The width of the bottom side of the trapezoid must be exactly 2 * N.

The height of the trapezoid must be exactly N + 1.

Also the top right and the bottom right angle of the trapezoid must be equal to 90 degrees.

See the examples bellow.

Input
Read from the standard input

On the only line in the console you are given an integer number N, showing the width of the smallest trapezoid side.

The input data will always be valid and in the format described. There is no need to check it explicitly.

Output
Print on the standard output

You must write the border of the described trapezoid on the console.

Use the symbol “*” (asterisk) to mark the border of the trapezoid.

= Use the symbol “.” (dot) to illustrate the empty spaces outside and inside the trapezoid.*/

import java.util.Scanner;

public class Trapezoid {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());

        System.out.printf("%s%s\n",repeatStr(".", n), repeatStr("*", n));
        int count = n -1;
        for (int i = n - 1; i >= 1; i--) {

            System.out.printf("%s*%s*\n", repeatStr(".", i), repeatStr(".", count));
            count++;
        }

        System.out.println(repeatStr("*", 2*n));
    }
    static String repeatStr(String strToRepeat, int count) {
        String text = "";
        for (int i = 0; i < count; i++) {
            text = text + strToRepeat;
        }
        return text;
    }
}
