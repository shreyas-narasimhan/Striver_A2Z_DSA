import java.util.*;
public class Sum_of_first_N_Natural_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int n = sc.nextInt();
        int sum = calculateSum(n);
        System.out.println("The sum of the first " + n + " natural numbers is: " + sum);
        sc.close();
    }

    public static int calculateSum(int n) {
        if (n <= 0) {
            return 0; // Base case: if n is 0 or negative, return 0
        }
        return n + calculateSum(n - 1); // Recursive call with n decremented by 1
    }
}