import java.util.*;
public class Pattern_18_Alpha_Triangle_Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            // Print characters from ('A' + N - 1 - i) to ('A' + N - 1)
            for (char ch = (char) ('A' + N - 1 - i); ch <= (char) ('A' + N - 1); ch++) {
                System.out.print(ch + " ");
            }
            // Move to next line after each row
            System.out.println();
        }
        sc.close();
    }
}