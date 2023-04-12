package week2.problems;

import java.util.Scanner;

public class CountNumberOfSetBits {
    // set bit is nothing but occurance of 1 in binary representation.
    // how to know if a bit is 1 or 0
    // using Bitwise AND (&)
    // i.e 1&1 = 1, means its a set bit, on the other hand 0&1 = 0, means its wasn't set bit
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        // works for positive number only
        int setBitCount = 0;
        while (n > 0) {
            if ((n&1) == 1) {
                setBitCount++;
            }
            n = n>>1;   // right shift by 1
        }
        System.out.println(setBitCount);
    }
}
