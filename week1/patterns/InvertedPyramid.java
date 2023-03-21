package week1.patterns;

import java.util.Scanner;

public class InvertedPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        for (int i=0; i<n; i++) {
            // spaces
            for (int j=0; j<i; j++) {
                System.out.print(" ");
            }

            // stars
            for (int k=0; k<n-i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
