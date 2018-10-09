import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Game {
    public static void main(String[] args)throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(reader.readLine());
        reader.close();
        int num1 = num /100;
        int num2 = (num /10) % 10;
        int num3 = num % 10;
        int result = 0;

        if ((num1 != 1 && num1 != 0 && num2 !=1 && num2 != 0 && num3 !=1 && num3 != 0) ||
                (num1 != 1 && num1 != 0 && num2 != 0 && num3 !=1 && num3 != 0) ){

            result = num1 * num2 * num3;
        }
        else if (((num1 == 1 || num1 == 0) && (num2 ==1 || num2 == 0) && (num3 ==1 || num3 == 0)) ||
                ((num1 == 1 || num1 == 0) && (num3 ==1 || num3 == 0)) || num2== 0){

            result = num1 + num2 + num3;
        }


        else if ((num1 == 1 || num1 == 0) && num2 !=1 && num2 != 0 && num3 !=1 && num3 != 0){
            result = num1 + num2 * num3;
        }
        else if (num1 != 1 && num1 != 0 && num2 !=1 && num2 != 0 && (num3 ==1 || num3 == 0)){
            result = num1 * num2 + num3;
        }

        System.out.println(result);
    }
}
