import java.util.Scanner;

public class GetLargestNumber {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int num1 = console.nextInt();
        int num2 = console.nextInt();
        int num3 = console.nextInt();
        int max = Math.max(num1, num2);
        if (max > num3){
            System.out.println(max);
        }
        else {
            System.out.println(num3);
        }
    }
}
