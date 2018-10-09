import java.util.Scanner;

public class Sort {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int h1 = console.nextInt();
        int h2 = console.nextInt();
        int h3 = console.nextInt();
        int h4 = console.nextInt();

        if (h1 < h2 && h2 < h3 && h3 < h4){
            System.out.println("Ascending");
        }
        else if (h1 > h2 && h2 > h3 && h3 > h4){
            System.out.println("Descending");
        }
        else {
            System.out.println("Mixed");
        }
    }
}
