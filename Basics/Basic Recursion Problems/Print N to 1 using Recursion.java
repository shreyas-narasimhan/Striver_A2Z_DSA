import java.util.*;
public class Print_N_to_1_using_Recursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int n = sc.nextInt();
        printNumbers(n); // Start printing from N to 1
        sc.close();
    }

    public static void printNumbers(int n) {
        if (n <= 0) {
            return; // Base case: if n is 0 or negative, stop recursion
        }
        System.out.println(n); // Print the current number
        printNumbers(n - 1); // Recursive call with n decremented by 1
    }
}