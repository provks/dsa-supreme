package week3Array.lec2;

import java.util.Scanner;

public class IntersectionOfTwoArrays {
    // find common elements in two arrays (BRUTE FORCE)
    public static void main(String[] args) {
        System.out.println("provide arr1 size");
        int arr1[] = takeArrayInput();        
        System.out.println("provide arr2 size");
        int arr2[] = takeArrayInput(); 
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    System.out.print(arr1[i] + " ");
                    arr1[j] = Integer.MIN_VALUE;    // to handle duplicates
                    break;
                }
            }
        }
    }

    private static int[] takeArrayInput() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Enter " + n + " elements"  );
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }
}
