import java.util.*;
public class Reverse_an_Array{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr); // Sort the array in ascending order
        System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        sc.close();
    }
}