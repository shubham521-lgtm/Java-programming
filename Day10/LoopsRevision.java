

public class LoopsRevision {
    public static void main(String[] args) {
//         Easy Level
//Print numbers from 1 to 10.
// f or (int i = 1; i <= 10; i++) {
//     System.out.println(i);
// }
// Print numbers from 10 to 1.
//   for(int i = 10 ; i>=1; i--){
//     System.out.println(i);
//   }
// Print the first N natural numbers.
// for (int i = 1; i <= 10; i++) {
//     System.out.println(i);
// }
// Print the first N natural numbers in reverse order.
// for(int i = 10 ; i>=1; i--){
//     System.out.println(i);
//   }
// Print all even numbers from 1 to N.
  //  for(int i = 1 ; i<=5; i++){
  //   System.out.println(2*i);
  // }
// Print all odd numbers from 1 to N.
//  for(int i = 1 ; i<=10;i++ ){
//     System.out.println(i);
//   }
// Find the sum of first N natural numbers.
//  int sum = 0;
//  for(int i =1; i<=10 ; i++)
//   sum = sum + i;
// {
  
//   System.out.println("Sum of first n natural number " + sum);
//  }
// Find the product of first N natural numbers.
// double product = 1;
//  for(int i =1; i<=10 ; i++)
//   product = product * i;
// {
  
//   System.out.println("product of first n natural number " + product);
//  }
// Print the multiplication table of a given number.
//   int table = 5;
  
//  for(int i =1; i<=10 ; i++)
  
// {
  
//   System.out.println(table + "X" + i +  " = "  +  table * i);
 
//  }
// Count the number of digits in a number.
// int num = 123456;
// int count = 0;
// while (num !=0){
//   num = num /10;
//   count++;
// }
// System.out.println("number of degit = " + count);

// Medium Level

// Reverse a number.
// int num = 123456;
// int reverse = 0;
// while (num !=0){
//   int digit = num % 10;
//   reverse = reverse *10 + digit;
//   num = num /10;
  
// }
// System.out.println("Reverse a number = " + reverse);

// Find the sum of digits of a number.
// int num = 123456;
// int sum = 0;
// while (num !=0){
//   int digit = num % 10;
//    sum = sum + digit;
//   num = num /10;
  
// }
// System.out.println("Sum of digit = " + sum);
// Find the product of digits of a number.
// int num = 123456;
// int product = 1;
// while (num !=0){
//   int digit = num % 10;
//    product = product * digit;
//   num = num /10;
  
// }

// System.out.println("product of digit = " + product);

// Check whether a number is Palindrome.
// int num = 1221;
// int orignal = num;
// int reverse = 0;
// while (num !=0){
//   int digit = num % 10;
//    reverse = reverse * 10 + digit;
//   num = num /10;
  
// }

// if(orignal == reverse){
//   System.out.println(" Given number is palindrom " + reverse);
// }
// else{
//   System.out.println(" Given number is not palindrom  ");
// }

// Check whether a number is Armstrong.
// int num = 153;
// int original = num;

// int sum = 0;

// int a = num ;
// int digits =0;
// while (a !=0 ) {
//      digits++;
//      a /= 10;
     
// }
// a = num;
// while(a!=0){
//     int digit = a%10;
//     sum +=(int) Math.pow(digit,digits);
//     a/=10;
// }
//    if (sum == original) {
//             System.out.println(original + " is an Armstrong Number.");
//         } else {
//             System.out.println(original + " is not an Armstrong Number.");
        // }
// Print the Fibonacci series up to N terms.
// int n = 10;

// int a = 0;
// int b = 1;
//  for(int i = 1; i<=n; i++){
   
//     int c= a+b;
//     a = b;
//     b = c;
//      System.out.println(a + " ");
//  }

// Find the factorial of a number.
int n = 10;
int f = 1;
for(int i = 1; i <=n; i++){
    f = f*i;
    System.out.println(f);
}

    }
}
