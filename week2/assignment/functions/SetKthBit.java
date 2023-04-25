package week2.assignment.functions;

import java.util.Scanner;

// https://www.geeksforgeeks.org/set-k-th-bit-given-number/
public class SetKthBit {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int k = sc.nextInt();
    sc.close();

    int ans = setNthBit(num, k);
    System.out.println(ans);
  }

  private static int setNthBit(int n, int k) {
    return (n | (1 << k));
  }
  
}
