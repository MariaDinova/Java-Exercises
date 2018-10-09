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
