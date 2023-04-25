package week2.assignment;

import java.util.Scanner;

public class SolidHalfDiamond {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    sc.close();

    // One way to solve the pattern
    // // top half
    // for (int i = 0; i < n; i++) {
    //   for (int j = 0; j <= i; j++) {
    //     System.out.print("*");
    //   }
    //   System.out.println();
    // }
    // // bottom half
    // for (int i = 0; i < n-1; i++) {
    //   for (int j = 0; j <= n-2-i; j++) {
    //     System.out.print("*");
    //   }
    //   System.out.println();
    // }

    // Another way to solve the pattern
    for (int i = 0; i < 2*n-1; i++) {
      int condition = 2*n-2-i;
      if (i < n) {
        condition = i;
      }
      for (int j = 0; j <= condition; j++) {
        System.out.print("*");
      }
      System.out.println();
    }

  }
}
