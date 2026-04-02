import java.util.*;
public class PrintallDivisorsofAgivenNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        System.out.println("Divisors of " + num + " are:");
        int ar[] = new int[100];
        int k = 0;
        for (int i = 1; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                ar[k++] = i;
                if (i != num / i) {
                    ar[k++] = num / i;
                }
            }
        }
        Arrays.sort(ar, 0, k);
        for (int i = 0; i < k; i++) {
            System.out.print(ar[i] + " ");
        }
    }
}