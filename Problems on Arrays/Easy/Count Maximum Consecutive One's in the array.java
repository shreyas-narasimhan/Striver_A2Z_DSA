import java.util.*;
public class CountMaximumConsecutiveOnesInTheArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array (0s and 1s):");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int maxConsecutiveOnes = countMaxConsecutiveOnes(arr);
        System.out.println("The maximum number of consecutive 1's in the array is: " + maxConsecutiveOnes);
    }
    public static int countMaxConsecutiveOnes(int[] arr) {
        int maxCount = 0;
        int currentCount = 0;
        for (int num : arr) {
            if (num == 1) {
                currentCount++; // Increment count for consecutive 1's
            } else {
                maxCount = Math.max(maxCount, currentCount); // Update max count if current count is greater
                currentCount = 0; // Reset current count when a 0 is encountered
            }
        }
        // Check for the last sequence of 1's at the end of the array
        return Math.max(maxCount, currentCount);
    }
}