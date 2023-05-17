package week3Array.basics;

public class FindMaximum {
    public static void main(String[] args) {
        int arr[] = CountZeroOne.getArrayInput();
        int max = findMaxElement(arr);
        System.out.println("Maximum element is: " +max);
    }

    private static int findMaxElement(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
    
}
