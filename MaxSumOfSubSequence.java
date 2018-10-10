/*Write a program that finds the maximal sum of consecutive elements in a given array of N numbers.

Input
On the first line you will receive the number N
On the next N lines the numbers of the array will be given
Output
Print the maximal sum of consecutive numbers*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MaxSumOfSubSequence {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());
        int[] numbers = new int[n];

        for (int i = 0; i < n; i++) {
            numbers[i] = Integer.parseInt(reader.readLine());
        }
        int currentSum = numbers[0];
        int startIndex = 0;
        int tempStartIndex = 0;
        int endIndex = 0;
        int maxSum = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (currentSum < 0) {
                currentSum = numbers[i];
                tempStartIndex = i;
            } else {
                currentSum += numbers[i];
            }
            if (currentSum > maxSum) {
                maxSum = currentSum;

                startIndex = tempStartIndex;
                endIndex = i;
            }
        }
        System.out.println(maxSum);
    }
}
