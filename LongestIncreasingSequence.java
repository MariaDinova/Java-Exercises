import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LongestIncreasingSequence {
    public static void main(String[] args)throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = Integer.parseInt(reader.readLine());
        }

        int sequenceLength = 1;
        int bestSequenceLength = 1;

        for (int i = 1; i < numbers.length; i++)
        {
            if (numbers[i] > numbers[i - 1])
            {
                sequenceLength++;

                if (sequenceLength > bestSequenceLength)
                {
                    bestSequenceLength = sequenceLength;
                }
            }
            else
            {
                sequenceLength = 1;
            }
        }
        System.out.println(bestSequenceLength);

    }
}
