import java.util.Scanner;

public class OddOrEvenProduct {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());

        long oddSum = 1;
        long evenSum = 1;

        for (int i = 1; i <= n; i++) {
            int num = console.nextInt();

            if (i%2 == 0){
                evenSum *= num;
            }
            else {
                oddSum *= num;
            }
        }
        if (oddSum == evenSum){
            System.out.println("yes " + oddSum);
        }
        else {
            System.out.println("no " + oddSum + " " + evenSum);
        }
    }
}
