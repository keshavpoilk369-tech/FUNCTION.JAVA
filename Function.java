
package Aimaster;
import java.util.Scanner;
public class Function {
    public static void PrintMyName(String name){
        System.out.println(name);
        return;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name : ");
        String name = sc.nextLine();

        PrintMyName(name); //__>> call kiya function ko

    }
}
