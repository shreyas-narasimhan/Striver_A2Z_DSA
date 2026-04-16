import java.util.*;
public class CheckIfArrayIsSortedAndRotated {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        boolean isSortedAndRotated = false;
        int count = 0;
        for (int i = 1; i < n; i++) {
            if (arr[i] < arr[i - 1]) {
                count++;
            }
        }
        if (count == 1 && arr[0] >= arr[n - 1]) {
            isSortedAndRotated = true;
        }
        if (isSortedAndRotated) {
            System.out.println("The array is sorted and rotated.");
        } else {
            System.out.println("The array is not sorted and rotated.");
        }
    }
}