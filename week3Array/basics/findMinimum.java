package week3Array.basics;

// import week3Array.basics.CountZeroOne;

public class FindMinimum {
    public static void main(String[] args) {
        int arr[] = CountZeroOne.getArrayInput();
        int min = findMinElement(arr);
        System.out.println("Maximum element is: " + min);
    }

    private static int findMinElement(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
    
}
