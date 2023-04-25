package week2.assignment;

import java.util.Scanner;

public class NumericHollowInvertedHalfPyramid {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    sc.close();
    
    for (int i = 0; i < n; i++) {
      int num = i+1;
      for (int j = 0; j < n-i; j++) {
        if (j == 0 || j == n-i-1 || i == 0)
          System.out.print(num);
        else 
          System.out.print(" ");
        num++;
      }
      System.out.println();
    }
  }
}
