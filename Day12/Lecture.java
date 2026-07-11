// package Day12;

import java.util.Scanner;

public class Lecture {
    public static void main(String[] args) {
        // decrement for loop
        // for(int i=7; i !=0; i--){
            // System.out.println(i);
        // }

        // pettern problem
        // int n = 4;
        // for (int i = n; i>0; i--){
        //    for(int j=0;j<i; j++){
        //      System.out.print("*"); 
        //    }

        //     System.out.print("\n");
        // }

        // sum first n evem number 
        // int n = 10;

        // int count =1;
        
        // int sum = 0;

        
        
        // while(count <=n){
        // sum = sum + 2*count;
        // count++;
        // }
        // System.out.println("Sum of first N number " + sum);

        // print multiplication table of a number in reverse order
    //   
    //  int n =10;
    //     for(int i=10; i>=1; i--){
    //     System.out.println(10 + " X " + i + " = " + n*i);
        
    //     }
    int num = 8;
       int factorial = 1;

        if (num < 0) {
            System.out.println("Factorial does not exist for negative numbers.");
        } else {
            for (int i = 1; i <= num; i++) {
                factorial = factorial * i;
            }

            System.out.println("Factorial of " + num + " is " + factorial);
        // using while loop
        int n = 9;
        int f =1;
        int i=1;
        while(i<=n) {
            f = f*i;
            i++;
        }System.out.println(f);
       
        }

        int num = 8;
        

        int sum = 0;

        for(int i =1; i<=10; i++){
            sum = sum + num*i;
        }
        System.out.println(sum);

        Calculate a^b using loops.
        int a = 3;
        int b = 1;
        int i =1;
        while(i<=1){
            System.out.println(Math.pow(a, b));
            i++;
        }

        

// public class Power {
    // public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter base (a): ");
        int a = scan.nextInt();

        System.out.print("Enter exponent (b): ");
        int b = scan.nextInt();

        int result = 1;

        for (int i = 1; i <= b; i++) {
            result = result * a;
        }

        System.out.println(a + "^" + b + " = " + result);

        sc.close();
    }
}
// Find the largest digit in a number.
  System.out.println("Enter a numbedr");
  int num = scan.nextInt();

  int largest = 0 ;
  while (num >0) {
    int digit = num%10;
    if(digit>largest){
        largest = digit;
    }
    num = num/10;
  }
  System.out.println("largest digit of the number " + largest);

    }
}
