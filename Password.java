
/*Петър забравил паролата за сейфа си. Единственото, което си спомня е, че тя се получава от цяло положително шестцифрено число N по следния начин:

Разменят се първата и шестата, втората и петата, третата и четвъртата цифри на N;

Пресмятат се частното и остатъка при деление на новополученото число на цялото положително число K;

Събират се получените частно и остатък.

Направете програма, която да извежда получената по описания начин парола.*/

import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String[] input = console.nextLine().split(" ");
        int n = Integer.parseInt(new StringBuilder(input[0]).reverse().toString());
        int k = Integer.parseInt(input[1]);

        int res1 = n / k;
        int res2 = n % k;

        System.out.println(res1+res2);

    }
}
