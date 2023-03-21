package week1.patterns;

import java.util.Scanner;

class SolidRectanlge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i=0; i<n; i++) {
            for (int j=0; j<2*n-1; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }

}