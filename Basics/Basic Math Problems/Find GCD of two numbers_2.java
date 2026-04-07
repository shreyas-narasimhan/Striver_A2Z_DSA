import java.util.*;
public class FindGCDOfTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        int a = num1, b = num2;
        while(num1 >0 && num2 >0){
            if(num1 > num2){
                num1= num1%num2;
            }
            else{
                num2= num2%num1;
            }
        }
        int gcd;
        if(num1==0){
            gcd=num2;
        }
        else{
            gcd=num1;
        }
        System.out.println("GCD of " + a + " and " + b + " is: " + gcd);
    }
}