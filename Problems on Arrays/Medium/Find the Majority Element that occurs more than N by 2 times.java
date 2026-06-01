import java.util.*;
public class MarjorityElements {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array");
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("The majority element is " + majorityElement(arr));
    }
    public static int majorityElement(int[] nums){
        int count =0;
        int element =0;
        for(int i=0; i<nums.length; i++) {
            if(count == 0) {
                element = nums[i];
            }
            if(nums[i] == element) {
                count++;
            } else {
                count--;
            }
        }
        return element;
    }
}