/*Слончето Лони различава цифрите от числата. А вие? :) Най – големите числа, които Лони познава, 
са четирицифрени и сега то ги изучава с голям интерес. За неговите изследвания му е необходима програма mindigit, 
която по дадено четирицифрено число намира най-малката цифра на това число, която е различна от 0.

Вход
Вашата програма прочита от първия ред на стандартния вход четирицифрено число.

Изход
На един ред на стандартния изход вашата програма трябва да изведе най-малката, различна от нула цифра на числото.*/

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
