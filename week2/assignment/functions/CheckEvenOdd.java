package week2.assignment.functions;

import java.util.Scanner;

public class CheckEvenOdd {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    sc.close();

    boolean isEven = findEven(n);
    if (isEven) {
      System.out.println(n + " is even.");
    } else {
      System.out.println(n + " is odd.");
    }
  }

  private static boolean findEven(int n) {
    /*if (n % 2 == 0) {*/ // using remainder when divided by 2
    if ((n&1) == 0) { // using bitwise and operator(preferred)
      return true;
    }
    return false;
  }
  
}
