package week2.assignment;

import java.util.Scanner;

public class ButterflyPattern {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    sc.close();

    for (int i = 0; i < 2*n; i++) {
      int condition = (i < n) ? i : n+(n-i-1);
      int spaceCount = (i < n) ? 2*(n-condition-1) : 2*(i-n); 
      for (int j = 0; j < 2*n; j++) {
        if (j <= condition) {
          System.out.print("*");
        } else if(spaceCount > 0) {
          System.out.print(" ");
          spaceCount--;
        } else {
          System.out.print("*");
        }
      }
      System.out.println();
    }
  }
}
