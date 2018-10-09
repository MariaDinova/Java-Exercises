import java.util.Scanner;

public class IntDoubleString {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String input = console.nextLine();

        switch (input){
            case "integer":
                int num = Integer.parseInt(console.nextLine());
                System.out.println(num + 1);
                break;
            case "real":
                double real = Double.parseDouble(console.nextLine());
                System.out.printf("%.2f", real + 1);
                break;
            case "text":
                String text = console.nextLine();
                System.out.printf("%s*", text);
                break;
        }
    }
}
