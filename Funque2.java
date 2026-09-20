package Aimaster;
import java.util.Scanner;
public class Funque2 {
    public static void printsumofodd(int n){
        int sum = 0;
        for(int i = 1; i <= n; i+=2){
            sum += i;
        }
        System.out.println("sum of odd number : "+sum);

    }
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number : ");
        int n = sc.nextInt();

        //call the function

        printsumofodd(n);

    }
}
