package Fun124;

public class Function {
    static void main() {
        // Function in java

        name();
//        String name = "keshav";
//        sayhello(name);

        sayhello("keshav");

//        int x = getnum();
//        System.out.println(x);
        System.out.println(getnum());

//       int x = multiply(5, 6);
//        System.out.println(x);

        System.out.println(multiply(4 , 2));
        }

        // no input , no output
    static void name() {
        System.out.println("Hello");
        return;  // optional
    }
    // input , not output

    static void sayhello(String name){
        System.out.println("hello "+ name);
    }
    // no input , output
    static int getnum(){
        return 10;
    }

    // input , output
    static int multiply(int a , int b){
        int mul = a * b;
        return mul;  // tow line will be reduse in one line -->> return (a * b );
    }
    }

