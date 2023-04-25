package week2.assignment;

import java.util.Scanner;

public class NumericPalindromeEquilateralPyramid {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    sc.close();

    for (int i = 0; i < n; i++) {
      // spaces
      for (int j = 0; j < n-i; j++) {
        System.out.print(" ");
      }

      // numbers
      int num = 1;
      for (int j = 0; j < i+1 ; j++) {
        System.out.print(num++);
      }

      // numbers
      num--;
      for (int j = 0; j < i ; j++) {
        System.out.print(--num);
      }
      System.out.println();
    }
  }
}
