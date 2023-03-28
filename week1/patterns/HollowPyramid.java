package week1.patterns;

import java.util.Scanner;

public class HollowPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        for (int i = 0; i < n; i++) {
            int k = 0;
            // columns
            for (int j = 0; j < (2*n) - 1; j++) {
                // condition for spaces
                if (j<n-i-1) {
                    System.out.print(" ");
                }
                // condition for star or space
                else if (k < 2*i+1) {
                    if (k==0 || k==2*i || i==n-1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                    k++;
                }
                // ending spaces
                else {
                    System.out.print("");
                }
            }
            System.out.println();
        }
    }
}
