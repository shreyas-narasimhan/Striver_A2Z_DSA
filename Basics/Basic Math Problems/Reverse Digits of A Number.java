import java.util.*;
public class ReverseDigitsofANumber{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int rev = 0,dup=num;
        while(dup!=0){
            rev=rev*10+dup%10;
            dup/=10;
        }
        System.out.println("Reversed number: " + rev);
    }
}