package week2.assignment.functions;

import java.util.Scanner;

/**
 * PrintAllPrime1toN
 */
public class PrintAllPrime1toN {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    sc.close();

    printAllPrimeTillN(n);
  }

  private static void printAllPrimeTillN(int n) {
    int num = 2;
    while (num <= n) {
      if (isPrime(num)) {
        System.out.print(num + " ");
      }
      num++;
    }
    System.out.println();
  }

  private static boolean isPrime(int num) {
    int i = 2;
    while (i <= Math.sqrt(num)) {
      if (num % i == 0) {
        return false;
      }
      i++;
    }
    return true;
  }
  
}