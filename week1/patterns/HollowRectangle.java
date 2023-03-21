package week1.patterns;

import java.util.Scanner;

class HollowRectanlge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        for (int i=0; i<n; i++) {
            for (int j=0; j<2*n-1; j++) {
                if (j==0 || i==0 || j==2*n-2 || i==n-1)
                    System.out.print("* ");
                else 
                    System.out.print("  ");
            }
            System.out.println("");
        }
    }

}