package week3Array.lec2;

import week3Array.basics.CountZeroOne;

public class FindUniqueInAraay {
    public static void main(String[] args) {
        int arr[] = CountZeroOne.getArrayInput();
        int unique = findUniqueElement(arr);
        System.out.println(unique);
    }

    private static int findUniqueElement(int[] arr) {
        int unique = 0;
        for (int i = 0; i < arr.length; i++) {
            unique ^= arr[i];
        }
        return unique;
    }

}
