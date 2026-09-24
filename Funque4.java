package Fun124;
import java.util.Scanner;
public class Funque4 {
    static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius : ");
        double r = sc.nextDouble();

        // call the function

       double x = circumferance(r);
        System.out.println(x);
    }

    static double circumferance(double r){

        double cir  = 2*3.14*r;
        return cir ;
    }
}
