package week2.assignment;

import java.util.Scanner;

public class FancyPatten1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    sc.close();

    if (n > 9) {
      System.out.println("Enter value <= 9");
      return;
    }
    for (int i = 0; i < n; i++) {
      int numPrintCol = 8-i;
      int num = i+1;
      int numCount = num;
      for (int j = 0; j < 17; j++) {
        if (j == numPrintCol && numCount > 0) {
          System.out.print(num);
          numPrintCol += 2;
          numCount--;
        } else 
          System.out.print("*");
      }
      System.out.println();
    }
  }
  
}
