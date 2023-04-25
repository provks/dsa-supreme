package week2.assignment;

import java.util.Scanner;

public class FancyPattern2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    sc.close();

    int num = 1;
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < 2*i+1 ; j++) {
        if (j % 2 == 0)
          System.out.print(num++);
        else
          System.out.print("*");
      }
      System.out.println();
    }

    num = num - n;
    for (int i = 0; i < n; i++) {
      int start = num;
      for (int j = 0; j < 2*n-1-2*i ; j++) {
        if (j % 2 == 0)
          System.out.print(start++);
        else
          System.out.print("*");
      }
      num = num-(n-i-1);
      System.out.println();
    }
  }
  
}
