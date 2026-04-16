import java.util.*;
public class FindLargestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int largest = arr[n - 2];
        int smallest = arr[1];
        System.out.println("The second largest element in the array is: " + largest);
        System.out.println("The second smallest element in the array is: " + smallest);
    }
}