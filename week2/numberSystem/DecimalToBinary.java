package week2.numberSystem;

import java.util.Scanner;
import java.lang.Math;

public class DecimalToBinary {

  public static int divideMethod(int n) {
    int binary = 0;
    int i = 0;
    while(n > 0) {
      int bit = n % 2;
      binary =  (int) (bit * Math.pow(10, i++) + binary);
      n = n/2;
    }
    return binary;
  }

  public static int bitwiseMethod(int n) {
    int binary = 0;
    int i = 0;
    while(n > 0) {
      int bit = n&1;
      binary =  (int) (bit * Math.pow(10, i++) + binary);
      n = n>>1;
    }
    return binary;
  }
  public static int decimalToOctal(int n) {
    int binary = 0;
    int i = 0;
    while(n > 0) {
      int bit = n % 8;
      binary =  (int) (bit * Math.pow(10, i++) + binary);
      n = n/8;
    }
    return binary;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int decimal = sc.nextInt();
    sc.close();

    // int binary = divideMethod(decimal);
    int binary = bitwiseMethod(decimal);  // prefer bitwise and operator method
    // int binary = decimalToOctal(decimal);  // decimal to octal, test I did
    System.out.println(binary);
    // BitwiseMethod(n);
  }
  
}
