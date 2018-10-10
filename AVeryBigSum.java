/*Calculate and print the sum of the elements in an array, keeping in mind that some of those integers may be quite large.
The first line of the input consists of an integer "n". 
The next line contains 'n' space-separated integers contained in the array.*/

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class AVeryBigSum {

        static long aVeryBigSum(long[] ar) {
            long sum = 0;
            for (long num:ar) {
                sum +=num;
            }

            return sum;
        }

        private static final Scanner scanner = new Scanner(System.in);

        public static void main(String[] args) throws IOException {


            int arCount = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            long[] ar = new long[arCount];

            String[] arItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < arCount; i++) {
                long arItem = Long.parseLong(arItems[i]);
                ar[i] = arItem;
            }

            long result = aVeryBigSum(ar);

            System.out.println(result);

            scanner.close();
        }
}
