package week3Array.lec2;

import week3Array.basics.CountZeroOne;

public class UnionOfTwoArrays {
    // Assume no duplicates, although many variations exists, like existing duplicates and get sorted uninon array.
    public static void main(String[] args) {
        System.out.println("Provide array 1");
        int arr1[] = CountZeroOne.getArrayInput();
        System.out.println("Provide array 2");
        int arr2[] = CountZeroOne.getArrayInput();

        int union[] = getUnionArray(arr1, arr2);
        // print union array
        for (int i = 0; i < union.length; i++) {
            System.out.print(union[i] + " ");
        }
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
    
}
