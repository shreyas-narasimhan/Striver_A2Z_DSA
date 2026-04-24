import java.util.*;
public class UnionOfTwoSortedArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the first sorted array: ");
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        System.out.println("Enter the elements of the first sorted array:");
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.print("Enter the number of elements in the second sorted array: ");
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        System.out.println("Enter the elements of the second sorted array:");
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }
        List<Integer> unionList = unionOfSortedArrays(arr1, arr2);
        System.out.println("Union of the two sorted arrays:");
        for (int num : unionList) {
            System.out.print(num + " ");
        }
    }
    public static List<Integer> unionOfSortedArrays(int[] arr1, int[] arr2) {
        List<Integer> unionList = new ArrayList<>();
        int i = 0, j = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                if (unionList.isEmpty() || unionList.get(unionList.size() - 1) != arr1[i]) {
                    unionList.add(arr1[i]);
                }
                i++;
            } else if (arr1[i] > arr2[j]) {
                if (unionList.isEmpty() || unionList.get(unionList.size() - 1) != arr2[j]) {
                    unionList.add(arr2[j]);
                }
                j++;
            } else { // Both elements are equal
                if (unionList.isEmpty() || unionList.get(unionList.size() - 1) != arr1[i]) {
                    unionList.add(arr1[i]);
                }
                i++;
                j++;
            }
        }
        // Add remaining elements from arr1
        while (i < arr1.length) {
            if (unionList.isEmpty() || unionList.get(unionList.size() - 1) != arr1[i]) {
                unionList.add(arr1[i]);
            }       i++;
        }
        // Add remaining elements from arr2
        while (j < arr2.length) {
            if (unionList.isEmpty() || unionList.get(unionList.size() - 1) != arr2[j]) {
                unionList.add(arr2[j]);
            }
            j++;
        }
        return unionList;
    }
}