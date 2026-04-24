import java.util.*;
public class TwoSumCheckIfAPairWithGivenSumExistsInArray {
    public static boolean twoSumHash(int[] arr, int target) {
        Set<Integer> seen = new HashSet<>();
        for (int num : arr) {
            int complement = target - num;
            if (seen.contains(complement)) {
                return true; 
            }
            seen.add(num);
        }
        return false; 
    }

    public static boolean twoSumTwoPointer(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum == target) {
                return true; 
            } else if (sum < target) {
                left++; 
            } else {
                right--; 
            }
        }
        return false; 
    }

    public static List<List<Integer>> twoSumTwoPointerArray(int[] arr, int target) {
        Arrays.sort(arr); // required for two-pointer

        int left = 0, right = arr.length - 1;
        List<List<Integer>> result = new ArrayList<>();

        while (left < right) {
            int sum = arr[left] + arr[right];

            if (sum == target) {
                result.add(Arrays.asList(arr[left], arr[right]));
                left++;
                right--;
                while (left < right && arr[left] == arr[left - 1]) left++;
                while (left < right && arr[right] == arr[right + 1]) right--;

            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        return result;
        }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the target sum: ");
        int target = sc.nextInt();
        Arrays.sort(arr); 
        System.out.println("Found: " + twoSumHash(arr, target));
        System.out.println("Found: " + twoSumTwoPointer(arr, target));
        System.out.println("Found: " + twoSumTwoPointerArray(arr, target));
    }
}