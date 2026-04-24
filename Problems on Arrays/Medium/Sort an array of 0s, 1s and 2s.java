import java.util.*;
public class SortAnArrayOf0s1sAnd2s {
    public static void sort012(int[] arr) {
        int zero = 0, one = 0, two = 0;

        for (int num : arr) {
            switch (num) {
                case 0:
                    zero++;
                    break;
                case 1:
                    one++;
                    break;
                case 2:
                    two++;
                    break;
            }
        }

        int i = 0;
        while (i < zero) {
            arr[i] = 0;
            i++;
        }
        while (i < zero + one) {
            arr[i] = 1;
            i++;
        }
        while (i < zero + one + two) {
            arr[i] = 2;
            i++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements (0s, 1s and 2s):");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sort012(arr);
        System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}