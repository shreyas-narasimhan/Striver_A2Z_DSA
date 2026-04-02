import java.util.*;
public class CheckIfANumberIsPalindromeOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int dup = num;
        int rev = 0;
        while(dup!=0){
            rev=rev*10+dup%10;
            dup/=10;
        }
        if(rev==num){
            System.out.println("The number is a palindrome.");
        }
        else{
            System.out.println("The number is not a palindrome.");
        }
    }
}