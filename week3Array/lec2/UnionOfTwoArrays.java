package week3Array.lec2;

import java.util.Scanner;

// import week3Array.basics.CountZeroOne;

public class UnionOfTwoArrays {

    public static int[] getArrayInput() {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        // sc.close();
        return arr;
    }

    // Assume no duplicates, although many variations exists, like existing duplicates and get sorted uninon array.
    public static void main(String[] args) {
        System.out.println("Provide array 1");
        int arr1[] = getArrayInput();
        System.out.println("Provide array 2");
        int arr2[] = getArrayInput();

        // int union[] = getUnionArray(arr1, arr2);
        // // print union array
        // for (int i = 0; i < union.length; i++) {
        //     System.out.print(union[i] + " ");
        // }
		findUnionArray(arr1, arr2);
        System.out.println();

    }

    private static int[] getUnionArray(int[] arr1, int[] arr2) {
        int[] union = new int[arr1.length+arr2.length];
        int start = 0;
        for (int i = 0; i < arr1.length; i++) {
            union[start++] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            union[start++] = arr2[i];
        }
        return union;
    }
    // handles duplicates
    private static void findUnionArray(int[] arr1, int[] arr2) {
        // remove duplicates using intersection
        findIntersection(arr1, arr2);

       for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != Integer.MIN_VALUE) System.out.print(arr1[i] + " ");
        }
        for (int i = 0; i < arr2.length; i++) {
             if (arr2[i] != Integer.MIN_VALUE) System.out.print(arr2[i] + " ");
        }
    }

    private static void findIntersection(int[] arr1, int[] arr2) {
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    arr1[j] = Integer.MIN_VALUE;    // to handle duplicates
                    break;
                }
            }
        }
    }
    
}
