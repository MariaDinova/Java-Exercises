import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MatrixOfNumbers {
    public static void main(String[] args)throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());

        for (int row = 1; row <= n; row++)
        {
            for (int num = row; num < row + n; num++)
            {
                System.out.print(num);
            }
            System.out.println();
        }
        System.out.println();
    }
}
