package week3Array.basics;

import java.util.Scanner;

public class CountZeroOne {
    public static void main(String[] args) {
        int[] arr = getArrayInput();
        countZeroOne(arr);
    }

    private static void countZeroOne(int arr[]) {
        int zeroCount = 0;
        int oneCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) zeroCount++;
            if (arr[i] == 1) oneCount++;
        }
        System.out.println("Zero count: " + zeroCount);
        System.out.println("One count: " + oneCount);
    }

    public static int[] getArrayInput() {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        return arr;
    }
    
}
