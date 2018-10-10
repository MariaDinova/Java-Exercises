/*Given a 6 x 6 2D Array, arr:

1 1 1 0 0 0
0 1 0 0 0 0
1 1 1 0 0 0
0 0 0 0 0 0
0 0 0 0 0 0
0 0 0 0 0 0
We define an hourglass in A to be a subset of values with indices falling in this pattern in arr's 
graphical representation:

a b c
  d
e f g
There are 16 hourglasses in arr, and an hourglass sum is the sum of an hourglass' values. 
Calculate the hourglass sum for every hourglass in arr, then print the maximum hourglass sum.

For example, given the 2D array:

-9 -9 -9  1 1 1 
 0 -9  0  4 3 2
-9 -9 -9  1 2 3
 0  0  8  6 6 0
 0  0  0 -2 0 0
 0  0  1  2 4 0
We calculate the following 16 hourglass values:

-63, -34, -9, 12, 
-10, 0, 28, 23, 
-27, -11, -2, 10, 
9, 17, 25, 18
Our highest hourglass value is 28 from the hourglass:

0 4 3
  1
8 6 6*/

import java.util.Scanner;

public class HourglassIn2DArray {

    static int hourglassSum(int[][] arr) {
        int sum = Integer.MIN_VALUE;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < 4; i++) {
            sum = 0;
            for (int j = 0; j < 4; j++) {
                sum = arr[i][j] + arr[i][j+1] + arr[i][j+2] + arr[i+1][j+1] + arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2];
                if (sum > maxSum){
                    maxSum = sum;
                }
            }
        }
    return maxSum;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int[][] arr = new int[6][6];
        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        int result = hourglassSum(arr);

        System.out.println(result);

        scanner.close();
    }
}
