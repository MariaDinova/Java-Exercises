/*Given a square matrix, calculate the absolute difference between the sums of its diagonals.
The first line contains a single integer "n" the number of rows and columns in the matrix "arr". 
Each of the next "n" lines describes a row "arr[i]" and consists of "n" space-separated integers "arr[i][j]".
*/
import java.util.Scanner;

public class DiagonalDifference {

    static int diagonalDifference(int[][] arr) {
        int sumFirstDiagonal = 0;
        int sumSecondDiagonal = 0;

        for (int i = 0; i < arr[0].length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (i == j){
                    sumFirstDiagonal += arr[i][j];
                }
                if(j + i == arr[0].length-1){
                    sumSecondDiagonal += arr[i][j];
                }
            }
        }
        int result = Math.abs(sumFirstDiagonal - sumSecondDiagonal);

        return result;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < n; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        int result = diagonalDifference(arr);

        System.out.println(result);

        scanner.close();
    }
}
