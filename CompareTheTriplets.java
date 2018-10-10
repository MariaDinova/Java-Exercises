/*Alice and Bob each created one problem for HackerRank. A reviewer rates the two challenges, 
awarding points on a scale from 1 to 100 for three categories: problem clarity, originality, and difficulty.

We define the rating for Alice's challenge to be the triplet a=(a[0], a[1], a[2]), and the rating for Bob's 
challenge to be the triplet b=(b[0], b[1], b[2]).

Your task is to find their comparison points by comparing a[0] with b[0],  a[1] with b[1], and a[2] with b[2].

If a[i] > b[i], then Alice is awarded  point.
If a[i] < b[i], then Bob is awarded  point.
If a[i] = b[i], then neither person receives a point.
Comparison points is the total points a person earned.

Given  and , determine their respective comparison points.*/

import java.util.Scanner;

public class CompareTheTriplets {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] a_triplet = new int[3];
        int[] b_triplet = new int[3];
        for (int i = 0; i < 3; i++) {
            a_triplet[i] = in.nextInt();
        }
        for (int i = 0; i < 3; i++) {
            b_triplet[i] = in.nextInt();
        }
        int alice_points = 0;
        int bob_points = 0;
        for (int i = 0; i < 3; i++) {
            if (a_triplet[i] > b_triplet[i]) {
                alice_points += 1;
            } else if (a_triplet[i] < b_triplet[i]) {
                bob_points += 1;
            }
        }
        System.out.printf("%d %d", alice_points, bob_points);
    }
}
