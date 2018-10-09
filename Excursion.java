import java.util.Scanner;

public class Excursion {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int busWidth = console.nextInt();
        int busHeight = console.nextInt();
        int n = console.nextInt();
        int a = 0;


        for (int i = 1; i <= n; i++) {
            int width = console.nextInt();
            int height = console.nextInt();

            if (busWidth > width || busHeight > height){
                a = 1;
                System.out.println(i);
                break;
            }
        }
        if (a == 0) {
            System.out.println("No crash");
        }
    }
}
