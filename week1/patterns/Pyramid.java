package week1.patterns;

import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        for (int i=0; i<n; i++) {
            // spaces
            for (int j=0; j<n-i-1; j++) {
                System.out.print(" ");
            }

            // stars
            for (int k=0; k<=i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
