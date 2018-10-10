/*Write a program that applies bonus score to given score in the range [1…9] by the following rules:

If the score is between 1 and 3, the program multiplies it by 10.
If the score is between 4 and 6, the program multiplies it by 100.
If the score is between 7 and 9, the program multiplies it by 1000.
If the score is less than 0 or more than 9, the program prints "invalid score".*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BonusScore {
    public static void main(String[] args)throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int score = Integer.parseInt(reader.readLine());

        if (score >= 1 && score <= 3){
            System.out.println(score *= 10);
        }
        else if (score >= 4 && score <= 6){
            System.out.println(score *= 100);
        }
        else if (score >= 7 && score <= 9){
            System.out.println(score *= 1000);
        }
        else {
            System.out.println("invalid score");
        }

    }
}
