import java.util.*;
public class Find_theMissing_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array (n-1): ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array (from 1 to n with one missing):");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int missingNumber = findMissingNumber(arr, n + 1);
        System.out.println("The missing number is: " + missingNumber);
    }
    public static int findMissingNumber(int[] arr, int totalCount) {
        int expectedSum = totalCount * (totalCount + 1) / 2; // Sum of first n natural numbers
        int actualSum = 0;
        for (int num : arr) {
            actualSum += num; // Sum of elements in the array
        }
        return expectedSum - actualSum; // The difference is the missing number
    }
}