import java.util.Scanner;

public class MultiplicationSign {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        double num1 = Double.parseDouble(console.nextLine());
        double num2 = Double.parseDouble(console.nextLine());
        double num3 = Double.parseDouble(console.nextLine());

        if (num1 == 0 || num2 == 0 || num3 == 0){
            System.out.println("0");
        }
        else if ((num1 < 0 && num2 < 0 && num3 < 0) || (num1 < 0 && num2 > 0 && num3 > 0)
                || (num1 > 0 && num2 < 0 && num3 > 0) || (num1 > 0 && num2 > 0 && num3 < 0)){
            System.out.println("-");
        }
        else if ((num1 > 0 && num2 > 0 && num3 > 0) || (num1 > 0 && num2 < 0 && num3 < 0)
                || (num1 < 0 && num2 > 0 && num3 < 0) || (num1 < 0 && num2 < 0 && num3 > 0)){
            System.out.println("+");
        }
    }
}
