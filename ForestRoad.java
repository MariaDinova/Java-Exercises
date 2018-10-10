/* Geeko, a non-stop learning trainee at Telerik Software Academy lived deep into the Lyulin forests. Every time he went to the 
Academy he had to take a long trip through the forest. Starting from the top left corner of the forest, the road always goes down 
and right first and when it reaches the border, it goes down and left.

The Academy is situated in the bottom left corner, and Geeko begins his journey from the top left corner of the forest 
(see the examples below).

He wanted to make a program that generates a map of the forest but he couldn’t. Help Geeko on his way to the Academy by 
writing the program instead of him.

Input
Read from the standard input

On the only line in the console you are given an integer number N, showing the width of the map.

The map’s height is always 2*N - 1.

The input data will always be valid and in the format described. There is no need to check it explicitly.

Output
Print to the standard output

You should print the whole map on the standard output

Use the symbol “*” (asterisk) to mark Geeko’s path and “.” (dot) to illustrate the trees*/

import java.util.Scanner;

public class ForestRoad {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());
        int count1 = 0;
        int count2 = n - 1;

        for (int i = 0; i < n; i++) {
            System.out.printf("%s*%s\n", repeatStr(".", count1), repeatStr(".", count2));
            count1++;
            count2--;
        }
        count1 = n-2;
        count2 = 1;
        for (int i = 0; i < n - 1; i++) {
            System.out.printf("%s*%s\n", repeatStr(".", count1), repeatStr(".", count2));
            count1--;
            count2++;
        }
    }

    static String repeatStr(String strToRepeat, int count) {
        String text = "";
        for (int i = 0; i < count; i++) {
            text = text + strToRepeat;
        }
        return text;
    }
}
