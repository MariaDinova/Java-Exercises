/*Write a program that, depending on the first line of the input, reads an int, double or string variable.

If the variable is int or double, the program increases it by one.
If the variable is a string, the program appends * at the end.
Print the result at the console. Use switch statement.*/

import java.util.Scanner;

public class IntDoubleString {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String input = console.nextLine();

        switch (input){
            case "integer":
                int num = Integer.parseInt(console.nextLine());
                System.out.println(num + 1);
                break;
            case "real":
                double real = Double.parseDouble(console.nextLine());
                System.out.printf("%.2f", real + 1);
                break;
            case "text":
                String text = console.nextLine();
                System.out.printf("%s*", text);
                break;
        }
    }
}
