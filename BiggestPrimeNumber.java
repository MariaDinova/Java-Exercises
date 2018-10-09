import java.util.Scanner;

public class BiggestPrimeNumber {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        console.close();

        while(isPrime(n) == false){
            n--;
        }
        System.out.println(n);

    }

    public static boolean isPrime(int m){
        int n=m;
        for(int i=2;i<n;i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }
}
