import java.util.*;
public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int dup = num;
        int sum = 0;
        while(dup!=0){
            int rem = dup%10;
            sum+=rem*rem*rem;
            dup/=10;
        }
        if(sum==num){
            System.out.println("The number is an Armstrong number.");
        }
        else{
            System.out.println("The number is not an Armstrong number.");
        }
    }
}