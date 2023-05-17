package week3Array.basics;

public class ReverseArray {
    public static void main(String[] args) {
        int arr[] = CountZeroOne.getArrayInput();
        reverseArray(arr);
        printArray(arr);
    }

    private static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
           System.out.print(arr[i] + " "); 
        }
        System.out.println();
    }

    private static void reverseArray(int[] arr) {
        for (int start = 0, end = arr.length-1; start < end; start++, end--) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;            
        }
    }
}
