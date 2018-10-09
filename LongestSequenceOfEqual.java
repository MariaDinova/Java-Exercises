import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LongestSequenceOfEqual {
    public static void main(String[] args)throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = Integer.parseInt(reader.readLine());
        }

        int maxNumbers = 0;
        int count = 1;
        int maxCount = 1;
        int pos = 0;
        while (pos < numbers.length - 1)
        {
            if (numbers[pos] == numbers[pos + 1])
            {
                count++;

                if (count > maxCount)
                {
                    maxCount = count;
                    maxNumbers = numbers[pos];
                }
            }
            else
            {
                count = 1;
            }
            pos++;
            if (maxCount == 1)
            {
                maxNumbers = numbers[0];
            }
        }
            System.out.println(maxCount);
    }
}
