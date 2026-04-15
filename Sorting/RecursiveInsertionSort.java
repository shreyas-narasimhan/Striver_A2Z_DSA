import java.util.*;

public class RecursiveInsertionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        insertionSort(arr, n);
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }

    public static void insertionSort(int[] arr, int n) {
        // Base case: If the array size is 1, it's already sorted
        if (n <= 1) {
            return;
        }

        // Recursive call for the first (n-1) elements
        insertionSort(arr, n - 1);

        // Insert the last element at its correct position in the sorted array
        int last = arr[n - 1];
        int j = n - 2;

        // Move all elements greater than 'last' one position ahead
        while (j >= 0 && arr[j] > last) {
            arr[j + 1] = arr[j];
            j--;
        }

        // Insert the 'last' element at its correct position
        arr[j + 1] = last;
    }
}