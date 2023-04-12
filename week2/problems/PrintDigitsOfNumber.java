package week2.problems;
import java.util.Scanner;
public class PrintDigitsOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        
        printDigits(n);
    }
    public static void printDigits(int n) {
        while (n > 0) {
            int lastDigit = n%10;
            System.out.println(lastDigit);
            n = n/10;
        }
    }
}