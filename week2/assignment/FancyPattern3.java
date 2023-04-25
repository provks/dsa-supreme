package week2.assignment;

import java.util.Scanner;

public class FancyPattern3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int methodNum = sc.nextInt();   // 0 or any number
    sc.close();

    if (methodNum == 0)
      method1(n); // my solution
    else
      method2(n); // lakshay's solution
  }

  private static void method2(int n) {
    for (int i = 0; i < n; i++) {
      int condition = (i <= n/2) ? 2*i : 2*(n-i-1);
      for (int j = 0; j <= condition; j++) {
        // increasing cols
        if(j <= condition/2) {
          System.out.print(j+1);
        } else {
          System.out.print(condition-j+1);
        }
      }
      System.out.println();
    }
  }

  private static void method1(int n) {
    // top half
    System.out.println("*");
    for (int i = 0; i < n/2+1; i++) {
      int num = 1;
      boolean isIncreasing = true;
      System.out.print("*");
      for (int j = 0; j < 2*i+1; j++) {
        System.out.print(num);
        if (num == i+1) {
          isIncreasing = false;
        }
        num = isIncreasing ? ++num : --num;
      }
      System.out.println("*");
    }
    // bottom half
    int condition = n-2;
    for (int i = 0; i < n/2; i++) {
      int num = 1;
      boolean isIncreasing = true;
      System.out.print("*");
      for (int j = 0; j < condition; j++) {
        System.out.print(num);
        if (num == condition/2+1) {
          isIncreasing = false;
        }
        num = isIncreasing ? ++num : --num;
      }
      condition -= 2;
      System.out.println("*");
    }
    System.out.println("*");
  }

}
