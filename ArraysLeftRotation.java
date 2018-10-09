import java.util.Scanner;

public class ArraysLeftRotation {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String[] nd = console.nextLine().split(" ");
        int n = Integer.parseInt(nd[0]);
        int d = Integer.parseInt(nd[1]);
        int[] a = new int[n];
        String[] aItems = console.nextLine().split(" ");
        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }

        int[] result = rotLeft(a, d);

        for (int i = 0; i < result.length; i++) {
            System.out.print(String.valueOf(result[i]));

            if (i != result.length - 1) {
                System.out.print(" ");
            }
    }
}

    private static int[] rotLeft(int[] a, int d) {
        for (int i = 0; i < d % a.length; i++)
        {
            int temp = a[0];
            for (int j = 1; j < a.length; j++)
            {
                a[j - 1] = a[j];
            }

            a[a.length - 1] = temp;
        }

        return a;
    }
}
