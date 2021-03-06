/*A balanced number is a 3-digit number whose second digit is equal to the sum of the first and last digit.

Write a program which reads and sums balanced numbers. You should stop when an unbalanced number is given.*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BalancedNumbers {
    public static void main(String[] args)throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;

        while (true){
            int num = Integer.parseInt(reader.readLine());
            int[]digits = Integer.toString(num).chars().map(c -> c-'0').toArray();

            if (digits[0] + digits[2] != digits[1] ){
                break;
            }
            else {
                sum += num;
            }
        }
        System.out.println(sum);
    }
}
