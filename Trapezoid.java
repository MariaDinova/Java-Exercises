import java.util.Scanner;

public class Trapezoid {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());

        System.out.printf("%s%s\n",repeatStr(".", n), repeatStr("*", n));
        int count = n -1;
        for (int i = n - 1; i >= 1; i--) {

            System.out.printf("%s*%s*\n", repeatStr(".", i), repeatStr(".", count));
            count++;
        }

        System.out.println(repeatStr("*", 2*n));
    }
    static String repeatStr(String strToRepeat, int count) {
        String text = "";
        for (int i = 0; i < count; i++) {
            text = text + strToRepeat;
        }
        return text;
    }
}
