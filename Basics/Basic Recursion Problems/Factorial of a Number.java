import java.util.*;
public class factorial_of_a_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int n = sc.nextInt();
        int result = factorial(n);
        System.out.println("The factorial of " + n + " is: " + result);
        sc.close();
    }

    public static int factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
        }
        if (n == 0 || n == 1) {
            return 1; // Base case: factorial of 0 or 1 is 1
        }
        return n * factorial(n - 1); // Recursive call with n decremented by 1
    }
}