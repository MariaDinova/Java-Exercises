/*Вчера Гошо си купи крачкомер. За съжаление, Гошо все още не се е научил да гледа какво купува. Крачкомера му  мери в мили, а той разбира само от метри.

Напишете програма, която по отчетените мили от крачкомера пресмята колко метра е изминал Гошо.*/

import java.util.Scanner;

public class MilesToMetres {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int miles = Integer.parseInt(console.nextLine());

        int metres = miles * 1609;
        System.out.println(metres);
    }
}
