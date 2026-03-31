import java.util.*;
public class StarPyramid {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the size of the pyramid: ");
        int N = s.nextInt();
        for (int i = 0; i < N; i++) {

            // Print leading spaces
            for (int j = 0; j < N - i - 1; j++) {
                System.out.print(" ");
            }

            // Print stars
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }

            // Print trailing spaces
            for (int j = 0; j < N - i - 1; j++) {
                System.out.print(" ");
            }

            // Move to next row
            System.out.println();
        }
        s.close();
    }
}