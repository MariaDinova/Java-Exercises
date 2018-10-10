/*ou are given N integers (given in a single line, separated by a space).

Write a program that checks whether the product of the odd elements is equal to the product of the even elements.
Elements are counted from 1 to N, so the first element is odd, the second is even, etc.
Input
On the first line you will receive the number N
On the second line you will receive N numbers separated by a whitespace
Output
If the two products are equal, output a string in the format "yes PRODUCT_VALUE", otherwise write on the console 
"no ODD_PRODUCT_VALUE EVEN_PRODUCT_VALUE"*/

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
