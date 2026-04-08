import java.util.*;
public class Highest_Lowest_Frequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        int maxFrequency = Collections.max(frequencyMap.values());
        int minFrequency = Collections.min(frequencyMap.values());

        List<Integer> highestFrequencyElements = new ArrayList<>();
        List<Integer> lowestFrequencyElements = new ArrayList<>();

        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() == maxFrequency) {
                highestFrequencyElements.add(entry.getKey());
            }
            if (entry.getValue() == minFrequency) {
                lowestFrequencyElements.add(entry.getKey());
            }
        }

        System.out.println("Highest Frequency Elements: " + highestFrequencyElements + " with frequency " + maxFrequency);
        System.out.println("Lowest Frequency Elements: " + lowestFrequencyElements + " with frequency " + minFrequency);
    }
}