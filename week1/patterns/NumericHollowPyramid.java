package week1.patterns;

import java.util.Scanner;

public class NumericHollowPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        for (int i=0; i<n; i++) {
            // spaces
            for (int j = 0; j < n-i-1 ; j++) {
                System.out.print(" ");
            }

			// number left half
			int num = i+1;
			for (int k = 0; k < i+1; k++) {
				System.out.print(num++);
			}

			// number right half
			int rightNum = 2*i;
			for (int l=0; l < i; l++) {
				System.out.print(rightNum--);
			}
            System.out.println();
        }
        
    }
}
