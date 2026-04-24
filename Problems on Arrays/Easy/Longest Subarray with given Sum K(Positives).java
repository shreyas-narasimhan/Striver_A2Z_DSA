import java.util.*;
public class Longest_Subarray_with_given_Sum_KPositives {
    public static void main(String[] args) {
        System.out.println("Enter the size of the array:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the value of K:");
        int k = sc.nextInt();
        System.out.println(longestSubarrayWithSumK(arr, k));
    }

    public static int longestSubarrayWithSumK(int[] arr, int k) {
        int n = arr.length;
        int maxLength = 0;
        int sum = arr[0];
        int left = 0;
        int right = 0;
        while (right < n) {
            while (left <= right && sum > k) {
                sum -= arr[left];
                left++;
            }
            if (sum == k) {
                maxLength = Math.max(maxLength, right - left + 1);
            }
            right++;
            if (right < n) {
                sum += arr[right];
            }
        }

        return maxLength;
    }
}