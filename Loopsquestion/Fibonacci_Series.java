// package Loopsquestion;

public class Fibonacci_Series {
    public static void main(String[] args) {
// Q4. Find factorial.
       int n = 11;
        int a = 0;

        int b = 1;
        System.out.println("fibonacci series");
        for( int i = 1; i<=n; i++){
            System.out.println(a);

            int c = a+b;
            a = b;
            b = c;
        }
        
    }
}
