import java.util.*;
public class Print_Name_N_times_using_Recursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name: ");
        String name = sc.nextLine();
        System.out.print("Enter the number of times to print the name: ");
        int n = sc.nextInt();
        printName(name, n);
        sc.close();
    }

    public static void printName(String name, int n) {
        if (n <= 0) {
            return; // Base case: if n is 0 or negative, stop recursion
        }
        System.out.println(name); // Print the name
        printName(name, n - 1); // Recursive call with n decremented by 1
    }
}