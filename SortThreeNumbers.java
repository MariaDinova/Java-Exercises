import java.util.Scanner;

public class SortThreeNumbers {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int num1 = Integer.parseInt(console.nextLine());
        int num2 = Integer.parseInt(console.nextLine());
        int num3 = Integer.parseInt(console.nextLine());

        if (num1 >= num2 && num1 >= num3 && num2 >= num3){
            System.out.printf(num1 + " " + num2 + " " + num3);
        }
        else if (num1 >= num2 && num1 >= num3 && num2 <= num3){
            System.out.printf(num1 + " " + num3 + " " + num2);
        }
        else if (num2 >= num1 && num2 >= num3 && num1 >= num3){
            System.out.printf(num2 + " " + num1 + " " + num3);
        }
        else if (num2 >= num1 && num2 >= num3 && num1 <= num3){
            System.out.printf(num2 + " " + num3 + " " + num1);
        }
        else if (num3 > num1 && num3 > num2 && num1 > num2){
            System.out.printf(num3 + " " + num1 + " " + num2);
        }
        else if (num3 >= num1 && num3 >= num2 && num1 <= num2){
            System.out.printf(num3 + " " + num2 + " " + num1);
        }
    }
}
