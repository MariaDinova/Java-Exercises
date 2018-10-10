/*Гошо много иска да се научи да разчита тайни съобщения. Съобщението се съдържда в буквите, но трябва да бъдат прочетени отзад напред.

Напишете програма, която да помага на Гошо с четенето на тайни съобщения.*/

import java.util.Scanner;

public class SecretMessage {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String input = console.nextLine();
        String onlyChars = input.replaceAll("[^A-Za-z]+", "");
        StringBuilder sb = new StringBuilder(onlyChars);
        String result = sb.reverse().toString();
        System.out.println(result);

    }
}
