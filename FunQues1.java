package Aimaster;
import java.util.Scanner;
public class FunQues1 {
    public static void printaverage(double num1, double num2, double num3){
        double average = (num1+num2+num3)/3;
        System.out.println("The average is: "+ average);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number : ");
        double num1 = sc.nextDouble();

        System.out.print("Enter second number : ");
        double num2 = sc.nextDouble();

        System.out.print("Enter third number : ");
        double num3 = sc.nextDouble();

        //call the function
        printaverage(num1,num2,num3);

      sc.close();
    }
}
