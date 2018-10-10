/*Write a program that reads two double values from the console A and B, stores them in variables and exchanges their values 
if the first one is greater than the second one. Use an if-statement. As a result print the values of the 
variables A and B, separated by a space.*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class ExchangeIfGreater {
    public static void main(String[] args)throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        double a = Double.parseDouble(reader.readLine());
        double b = Double.parseDouble(reader.readLine());

        DecimalFormat df = new DecimalFormat("0.###");

        if (a > b){
            double temp = a;
            a = b;
            b = temp;
        }
        System.out.println(df.format(a) + " " + df.format(b));
    }
}
