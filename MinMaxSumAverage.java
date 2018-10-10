/*Write a program that reads from the console a sequence of N real numbers and returns the minimal, the maximal number, 
the sum and the average of all numbers (displayed with 2 digits after the decimal point).

The input starts by the number N (alone in a line) followed by N lines, each holding an real number.*/

import java.util.Scanner;

public class MinMaxSumAverage {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());
        double min = Integer.MAX_VALUE;
        double max = Integer.MIN_VALUE;
        double sum = 0;
        double num;

        for (int i = 0; i < n; i++) {
            num = Double.parseDouble(console.nextLine());
            sum += num;
            if (num > max){
                max = num;
            }
            if (num < min){
                min = num;
            }
        }
        System.out.printf("min=%.2f", min);
        System.out.println();
        System.out.printf("max=%.2f", max);
        System.out.println();
        System.out.printf("sum=%.2f", sum);
        System.out.println();
        System.out.printf("avg=%.2f", sum/n);
    }
}
