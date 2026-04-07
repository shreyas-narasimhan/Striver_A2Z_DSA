import java.util.*;
public class CountDigitsInANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long num = sc.nextLong();
        long count = 0;
        count = (long) (Math.log10(num)) + 1;
        System.out.println("Number of digits: " + count);
    }
}