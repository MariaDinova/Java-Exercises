import java.math.BigDecimal;
import java.util.Scanner;

public class CartesianCoordinates {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        BigDecimal x1 = new BigDecimal(console.nextLine());
        BigDecimal y1 = new BigDecimal(console.nextLine());
        double x = x1.doubleValue();
        double y = y1.doubleValue();

        if (x > 0 && y > 0){
            System.out.println("1");
        }
        else if (x < 0 && y > 0){
            System.out.println("2");
        }
        else if (x < 0 && y < 0){
            System.out.println("3");
        }
        else if (x > 0 && y < 0){
            System.out.println("4");
        }
        else if ((x == 0 && y > 0) || (x == 0 && y < 0)){
            System.out.println("5");
        }
        else if ((x > 0 && y == 0) || (x < 0 && y == 0)){
            System.out.println("6");
        }
        else if (x == 0 && y == 0){
            System.out.println("0");
        }
    }
}
