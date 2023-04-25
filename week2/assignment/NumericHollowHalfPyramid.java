package week2.assignment;

import java.util.Scanner;

public class NumericHollowHalfPyramid {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    sc.close();
    
    for (int i = 0; i < n; i++) {
      int num = 1;
      for (int j = 0; j <= i; j++) {
        if(i == n-1 || j == 0 || j == i)
          System.out.print(num);
        else 
          System.out.print(" ");
        num++;
      }
      System.out.println();
    }
  }
  
}
