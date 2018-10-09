import java.util.Scanner;

public class MilesToMetres {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int miles = Integer.parseInt(console.nextLine());

        int metres = miles * 1609;
        System.out.println(metres);
    }
}
