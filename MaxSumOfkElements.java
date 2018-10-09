import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class MaxSumOfkElements {
    public static void main(String[] args)throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        int numberOfElements = Integer.parseInt(reader.readLine());
        int elementsForSum = Integer.parseInt(reader.readLine());

        Integer[] numbers = new Integer[numberOfElements];
        for (int i = 0; i < numberOfElements; i++) {
            numbers[i] = Integer.parseInt(reader.readLine());
        }
        Arrays.sort(numbers, Collections.reverseOrder());

        for (int i = 0; i < elementsForSum; i++) {
            sum += numbers[i];
        }
        System.out.println(sum);
    }
}
