package Fun124;

public class Function1 {
    static void main() {

        // Function overloading
        System.out.println(sum(5 , 6));

        int x = sum(4 , 9);
        System.out.println(x);

        int y = sum(2 , 4 , 6); // different number of parameter
        System.out.println(y);

         greet("keshav" , 43);
         greet(34, "radha ");

         int z = sum(4.5 , 6);  // different type of parameter
        System.out.println(z);


    }

    static int sum(int a , int b){
        return a+b;
    }
    static int sum(int a, int b , int c){
        return  a+b+c;
        //means ager function alg alg hai kaam ek hi ho rha hai ex. sum then function same rk skte hai
    }
    static void greet(String name , int age){
        System.out.print("Hi "+ name + ". Your age is : "+ age);
    }

    static void greet(int age , String name){
        System.out.print("Hi "+ name + ". Your age is : "+ age);
    }
    static int sum(double a , double b){
      return (int)(a+b);
    }

}
