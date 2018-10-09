import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MinDigit {
    public static void main(String[] args)throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(reader.readLine());
        int[]digits = Integer.toString(num).chars().map(c -> c-'0').toArray();

        int min = digits[0];
        for (int i = 0; i < 4; i++) {
            if (digits[i] < min && digits[i] !=0){
                min = digits[i];
            }
        }
        System.out.println(min);
    }
}
