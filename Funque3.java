package Fun124;
import java.util.Scanner;
public class Funque3 {
    static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number : ");
        double a = sc.nextDouble();

        System.out.print("Enter second number : ");
        double b = sc.nextDouble();

        grater(a , b);
    }
static void grater(double a , double b){
        if(a > b){
            System.out.println("a is grater");
        }else{
            System.out.println("b is grater");
        }
        return;
}


}
