import java.util.Scanner;

public class NotDivisableNumber {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());

        for (int i = 1; i <= n; i++) {
            if (i%3 != 0 && i%7 !=0){
                System.out.print(i + " ");
            }
        }
    }
}
