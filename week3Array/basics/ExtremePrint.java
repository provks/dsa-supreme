package week3Array.basics;

public class ExtremePrint {
    public static void main(String[] args) {
        int[] arr = CountZeroOne.getArrayInput();
        extremePrint(arr);
    }

    private static void extremePrint(int[] arr) {
        for (int start = 0, end = arr.length-1;  start <= end; start++, end--) {
            if(start == end) {
                System.out.print(arr[start] + " ");
            } else {
                System.out.print(arr[start] + " ");
                System.out.print(arr[end] + " ");
            }
        }
    }
}
