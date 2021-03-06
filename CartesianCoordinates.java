/*You are given a two-dimensional Cartesian coordinate system and the two coordinates (X and Y) of a point in the coordinate system. 
If you don't know what Cartesian coordinate system is Google it with Bing. As you will find, the coordinate system is divided 
by 2 lines (see the picture bellow) which divide the plain in four parts. Each of these parts has a lot of points that are 
numbered between 1 and 4. There is one point where our lines are crossing. This point has the following coordinates: X=0 and Y=0. 
As a result this point is numbered 0. The points on the lines are also numbered with the numbers 5 and 6 (again see the picture below).

Your task is to write a program that finds the number of the location of the given point in the coordinate system.

 */

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
