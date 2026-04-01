import java.util.*;
public class Pattern_13_Increasing_Number_Triangle_Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        int num = 1; // Starting number

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++; // Increment the number for the next position
            }
            System.out.println(); // Move to the next line after each row
        }

        sc.close();
    }
}