
import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String[] input = console.nextLine().split(" ");
        int n = Integer.parseInt(new StringBuilder(input[0]).reverse().toString());
        int k = Integer.parseInt(input[1]);

        int res1 = n / k;
        int res2 = n % k;

        System.out.println(res1+res2);

    }
}
