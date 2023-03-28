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

			// number left half (printing 1)
			System.out.print(1);

			// number right half (rest of the numbers)
			for (int l = 0; l < i; l++) {
				int num = l+2;
				if (l == i-1 || i == n-1)
					System.out.print(" " + num);
				else 
					System.out.print("  ");
				num++;
			}
            System.out.println();
        }
        
    }
}
