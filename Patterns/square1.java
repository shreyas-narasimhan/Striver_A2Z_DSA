import java.util.*;
public class square1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the size of the square: ");
        int rows = s.nextInt();
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        s.close();
    }
}