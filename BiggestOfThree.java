import java.util.Scanner;

public class BiggestOfThree {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        double num1 = Double.parseDouble(console.nextLine());
        double num2 = Double.parseDouble(console.nextLine());
        double num3 = Double.parseDouble(console.nextLine());

        double maxTemp = Math.max(num1, num2);
        double max = Math.max(num3, maxTemp);

        if (max == (int) max) {
            System.out.println((int) max);
        } else {
            System.out.println(max);
        }
    }
}
