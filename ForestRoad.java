import java.util.Scanner;

public class ForestRoad {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());
        int count1 = 0;
        int count2 = n - 1;

        for (int i = 0; i < n; i++) {
            System.out.printf("%s*%s\n", repeatStr(".", count1), repeatStr(".", count2));
            count1++;
            count2--;
        }
        count1 = n-2;
        count2 = 1;
        for (int i = 0; i < n - 1; i++) {
            System.out.printf("%s*%s\n", repeatStr(".", count1), repeatStr(".", count2));
            count1--;
            count2++;
        }
    }

    static String repeatStr(String strToRepeat, int count) {
        String text = "";
        for (int i = 0; i < count; i++) {
            text = text + strToRepeat;
        }
        return text;
    }
}
