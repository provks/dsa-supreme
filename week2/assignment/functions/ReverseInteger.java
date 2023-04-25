package week2.assignment.functions;

import java.util.Scanner;

public class ReverseInteger {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    sc.close();

    int reversedNumber = reverse(n);
    System.out.println(reversedNumber);
  }

  private static int reverse(int n) {
    int ans = 0;
    boolean isNegative = false;

    if (n <= Integer.MIN_VALUE) {
      return ans;
    }
    if (n < 0) {
      isNegative = true;
      n = -n;
    }

    while (n > 0) {
      int digit = n % 10;
      ans = ans * 10 + digit; 
      n = n / 10;
    }
    return isNegative ? -ans :  ans;
  }
  
}
