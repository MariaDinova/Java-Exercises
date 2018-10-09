import java.util.Scanner;

public class NumbersFrom1toN {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());

        for (int i = 1; i <= n; i++) {
            System.out.print(i);
            System.out.print(" ");
        }
    }
}
