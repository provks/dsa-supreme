package week2.numberSystem;

import java.util.Scanner;

public class BinaryToDecimal {

  public static int binaryToDecimal(int binary) {
    int decimal = 0, i = 0;
    while (binary > 0) {
      int bit = binary % 10;
      decimal = (int) (decimal + (bit * Math.pow(2, i++)));
      binary = binary / 10;
    }
    return decimal;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int binary = sc.nextInt();
    sc.close();

    System.out.println(binaryToDecimal(binary));
  }
  
}
