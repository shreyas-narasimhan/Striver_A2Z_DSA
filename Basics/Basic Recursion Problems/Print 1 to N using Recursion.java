import java.util.*;
public class Print_1_to_N_using_Recursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int n = sc.nextInt();
        printNumbers(1, n); // Start printing from 1 to N
        sc.close();
    }

    public static void printNumbers(int current, int n) {
        if (current > n) {
            return; // Base case: if current exceeds n, stop recursion
        }
        System.out.println(current); // Print the current number
        printNumbers(current + 1, n); // Recursive call with current incremented by 1
    }
}