package week2.assignment.functions;

import java.util.Scanner;

public class CheckPrime {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    sc.close();

    if (isPrime(n)) {
      System.out.println(n + " is a prime number.");
    } else {
      System.out.println(n + " is not a prime number.");
    }
  }

  private static boolean isPrime(int n) {
    int i = 2;
    // while (i < n) {
    while (i <= Math.sqrt(n)) {   // optimised
      if (n % i == 0) {
        return false;
      }
      i++;
    }
    return true;
  }
  
}
