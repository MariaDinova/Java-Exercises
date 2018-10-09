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
