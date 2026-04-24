import java.util.*;
public class FindTheNumberThatAppearsOnceAndTheOtherNumbersTwice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array (one number appears once, others appear twice):");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int uniqueNumber = findUniqueNumber(arr);
        System.out.println("The number that appears once is: " + uniqueNumber);
    }
    public static int findUniqueNumber(int[] arr) {
        int unique = 0;
        for (int num : arr) {
            unique ^= num; // XOR operation to find the unique number
        }
        return unique;
    }
}