import java.util.Scanner;

public class BiggestOfFive {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        double num1 = Double.parseDouble(console.nextLine());
        double num2 = Double.parseDouble(console.nextLine());
        double num3 = Double.parseDouble(console.nextLine());
        double num4 = Double.parseDouble(console.nextLine());
        double num5 = Double.parseDouble(console.nextLine());

        double maxTemp = Math.max(Math.max(num1, num2), Math.max(num3, num4));
        double max = Math.max(maxTemp, num5);

        if (max == (int) max) {
            System.out.println((int) max);
        } else {
            System.out.println(max);
        }
    }
}
