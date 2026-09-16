package Aimaster;
import java.util.Scanner;

public class Function_product {
    public static int CalculateProduct(int a , int b){
        int product = a*b;
        return product;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int a = sc.nextInt();
        System.out.print("Enter second name :  ");
        int b = sc.nextInt();

        int product = CalculateProduct(a , b);
        System.out.println(product);


    }
}
