import java.util.*;

public class Pattern_11_Binary_Number_Triangle_Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int N = sc.nextInt();

        int spaces = 2 * (N - 1);

        for (int i = 1; i <= N; i++) {

            // Increasing numbers
            for (int j = 1; j <= i; j++) {
                System.out.printf("%2d", j); // fixed width
            }

            // Spaces
            for (int j = 1; j <= spaces; j++) {
                System.out.print("  "); // double space for alignment
            }

            // Decreasing numbers
            for (int j = i; j >= 1; j--) {
                System.out.printf("%2d", j);
            }

            System.out.println();
            spaces -= 2;
        }

        sc.close();
    }
}