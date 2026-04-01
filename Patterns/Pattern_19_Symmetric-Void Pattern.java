import java.util.*;
public class Pattern_19_Symmetric_Void_Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int N = sc.nextInt();
        int iniS = 0;
        // Loop for upper half rows
        for (int i = 0; i < N; i++) {
            // Print stars on left
            for (int j = 1; j <= N - i; j++) {
                System.out.print("*");
            }
            // Print spaces in middle
            for (int j = 0; j < iniS; j++) {
                System.out.print(" ");
            }
            // Print stars on right
            for (int j = 1; j <= N - i; j++) {
                System.out.print("*");
            }
            // Increase middle spaces by 2
            iniS += 2;
            // Move to next row
            System.out.println();
        }

        // Initial spaces for lower half
        iniS = 2 * N - 2;

        // Loop for lower half rows
        for (int i = 1; i <= N; i++) {
            // Print stars on left
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Print spaces in middle
            for (int j = 0; j < iniS; j++) {
                System.out.print(" ");
            }
            // Print stars on right
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Decrease middle spaces by 2
            iniS -= 2;
            // Move to next row
            System.out.println();
        }
     sc.close();

    }
}