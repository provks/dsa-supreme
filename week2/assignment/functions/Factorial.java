package week2.assignment.functions;

import java.util.Scanner;

public class Factorial {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    sc.close();

    int factorial = findFactorial(n);
    System.out.println(factorial);
  }

  private static int findFactorial(int n) {
    int factorial = 1;
    if ( n <= 0) {
      return factorial;
    }
    while (n > 1) {
      factorial *= n;
      n--;
    }
    return factorial;
  }
  
}
