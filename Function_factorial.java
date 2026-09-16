package Aimaster;
import java.util.Scanner;

public class Function_factorial {

    public static void CalculateFactorial(int n){
        //loops
        if(n < 0){
            System.out.println("Invalid");
            return;
        }
        int factorial = 1;

        for(int i=n; i>=1; i--){
            factorial = factorial*i;
        }
        System.out.println(factorial);
        return;
    }
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        CalculateFactorial(n);
    }
}
