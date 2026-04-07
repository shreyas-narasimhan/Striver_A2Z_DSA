import java.util.*;
public class Print_fibonacci_series_up_to_nth_term {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int n = sc.nextInt();
        System.out.println("Fibonacci series up to " + n + "th term:");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
        sc.close();
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n; // Base case: return n for 0 and 1
        }
        return fibonacci(n - 1) + fibonacci(n - 2); // Recursive call for Fibonacci sequence
    }
}