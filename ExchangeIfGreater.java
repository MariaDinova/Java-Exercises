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
