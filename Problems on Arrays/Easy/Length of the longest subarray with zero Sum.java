import java.util.*;
public class Length_of_the_longest_subarray_with_zero_Sum {
    public static void main(String[] args) {
        System.out.println("Enter the size of the array:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Length of the longest subarray with zero sum: " + longestSubarrayWithZeroSum(arr));
    }

    public static int longestSubarrayWithZeroSum(int[] arr) {
        int n = arr.length;
        int maxLength = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            if (sum == 0) {
                maxLength = i + 1;
            } else if (map.containsKey(sum)) {
                maxLength = Math.max(maxLength, i - map.get(sum));
            } else {
                map.put(sum, i);
            }
        }
        return maxLength;
    }
}