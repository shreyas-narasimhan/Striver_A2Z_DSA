import java.util.*;
public class RecursiveBubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        bubbleSort(arr, n);
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }

    public static void bubbleSort(int[] arr, int n) {
        // Base case: If the array size is 1, it's already sorted
        if (n == 1) {
            return;
        }

        // One pass of bubble sort. After this pass, the largest element is moved to end.
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                // Swap arr[i] and arr[i + 1]
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }

        // Recursive call for the remaining array
        bubbleSort(arr, n - 1);
    }
}