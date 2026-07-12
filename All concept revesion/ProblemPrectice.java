// package All concept revesion;
import java.util.Scanner;
public class ProblemPrectice {
    public static void main(String[] args) {
//         🟢 Easy Level (20 Questions)
// Print "Hello, Java".

// System.out.println("HELLO SHUBHAM  UIKEY");
Scanner scan = new Scanner(System.in);



// Input two numbers and print their sum.

// System.out.println("Enter a num1");
// int num1 = scan.nextInt();
// System.out.println("Enter a num2");
// int num2 = scan.nextInt();
// int sum = num1 + num2;
// System.out.println("Sum of tweo number " + sum);

// Input two numbers and print subtraction, multiplication, division, and remainder.
// System.out.println("Enter a num1");
// int num1 = scan.nextInt();
// System.out.println("Enter a num2");
// int num2 = scan.nextInt();
// int subtraction = num1 - num2;
// System.out.println("subtraction of tweo number " + subtraction);
// int product = num1 *num2;
// System.out.println("product of two number " + product);
// int divide = num1 /num2;
// System.out.println("divide of two number " + divide);
// int remainder = num1 %num2;
// System.out.println("remainder of two number " + remainder);



// Swap two numbers using a third variable.

// int a = 20;
// int b = 30;

// int c = a;
//     a = b;
//     b = c;
//     System.out.println("a = " + a);
//     System.out.println("b = " + b);

// Swap two numbers without using a third variable.
// int a = 20;
// int b = 30;


//     a = a + 10;
//     b = 50 - a;
//     System.out.println("a = " + a);
//     System.out.println("b = " + b);

// Find the square of a number.
// int num = 8;
// int num1 = 2;
// System.out.println(Math.pow(num , 2));

// Find the cube of a number.

// int num = 8;
// int num1 = 3;
// System.out.println(Math.pow(num , 3));

// Calculate the area of a rectangle.
//  System.out.println("Enter length of a rectangle");
//  int L = scan.nextInt();

//  System.out.println("Enter width of a rectangle");
//  int W = scan.nextInt();
  
//  int area = L * W ;
//  System.out.println("area of a rectangle = " + area);
 

// Calculate the perimeter of a rectangle.
//  System.out.println("Enter length of a rectangle");
//  int L = scan.nextInt();

//  System.out.println("Enter width of a rectangle");
//  int W = scan.nextInt();
  
//  int perimeter = 2 * (L + W) ;
//  System.out.println("perimeter of a rectangle = " + perimeter);

// Calculate the area of a circle.
// System.out.println("Enter redius of a circule");
//  int R = scan.nextInt();

//  System.out.println("Enter width of a rectangle");
//  int W = scan.nextInt();
  
 
// Calculate the circumference of a circle.
// System.out.println("Enter redius of a circule");
//  int R = scan.nextInt();
//  float  circumference = 2 * 3.14f *R ;
 
//  System.out.println("circumference of a circule = " + circumference);

// Convert Celsius to Fahrenheit.
// System.out.println("Enter celsius");
//  int C = scan.nextInt();
//  float  Fahrenheit = C * 1.8f + 32 ;
 
//  System.out.println(" fahrenheit = " + Fahrenheit );

// Convert Fahrenheit to Celsius.

// System.out.println("Enter fahrenheit");
//  int F = scan.nextInt();
//  float  celsius = (F - 32)*1.8f ;
 
//  System.out.println(" celcius = " + celsius );
 
// Find the average of three numbers.
// int a = 20;
// int b = 39;
// int c = 40;
// float average = (a + b + c)/3;
// System.out.println("average = " + average);

// Check whether a number is positive, negative, or zero.
//    System.out.println("Enter a number ");
//    int num = scan.nextInt();
    // ternary operator
    // condition ? expresion1:expression2;
    // if the condition is true , expression1 is execute
    // if the condition is false , expression2 is execute
     
    // String result = (num > 0)?"Posetive"
    //        :(num < 0)?"Negative"
    //        :"Zero";
    //        System.out.println(result);

// Check whether a number is even or odd.
//    if the condition is true , expression1 is execute
          
// Find the largest of two numbers.
// System.out.println("Enter a number 2 ");
//    int num2 = scan.nextInt();

//    String largest = (num>num2)?"larg"
//                     :"small";
//     System.out.println(largest);

// int a = 30 ,b = 20;
// int Max = (a>b)?a:b;
// System.out.println("Maximum = " + Max);

// Find the smallest of two numbers.
// int a = 30 ,b = 20;
// int Small = (a<b)?a:b;
// System.out.println("Smallest = " + Small);

// Print the first N natural numbers.
// int n = 10;
// for(int i=1; i<=n ;i++){
//     System.out.println(i);
// }
// Print numbers from N to 1.
// int n = 10;
// for(int i=n; i>=1 ;i--){
//     System.out.println(i);
// }

// 🟡 Medium Level (20 Questions)

// Find the largest among three numbers.
//   int a = 9;
//   int b = 10;
//   int c = 70;

//   String  Largest = (a>b)?"a"
//                   :(b>c)?"b"
//                   :"c";
//                   System.out.println(Largest);
                
// if(a>b && a>c){
//     System.out.println("Largest number a = " + a);
// }else if(b>a && b>c){
//     System.out.println("Largest number b = " + b);

// }else{
//     System.out.println("Largest number c = " + c);
// }

// Find the smallest among three numbers.
// if(a<b && a<c){
//     System.out.println("Smalest number a = " + a);
// }else if(b<a && b<c){
//     System.out.println("Smalest number b = " + b);

// }else{
//     System.out.println("Smalest number c = " + c);
// }

// Check whether a year is a leap year.
//   int year = 2000;
//   if((year % 4 ==0 && year % 100 !=0) ||( year %400 ==0)){
//     System.out.println("Year is an leep year " );
//   }else{
//     System.out.println("Not a leep year");
//   }
// Check whether a character is a vowel or consonant.
// System.out.println("Enter an charector ");
// char ch = scan.next().charAt(0);

// if((ch=='a'|| ch=='e' || ch=='i' || ch=='o' || ch=='u')
//     ||(ch=='A'|| ch=='E' || ch=='I' || ch=='O' || ch=='U') ){
// System.out.println("VOWEL");}
// else{
//     System.out.println("Consonant");
// }

// Print the multiplication table of a number.
// int n= 5;
// for(int i=1; i<=10;i++){
//     System.out.println(5 + " X " + i +" = " + n*i);
// }
// Print all even numbers from 1 to N.
//    int n = 10;
// for(int i=1; i<=n;i++){
    
//     System.out.println( 2*i);
// }
// Print all odd numbers from 1 to N.
// int n = 10;
// for(int i=1; i<=n;i++){
    
//     System.out.println( 2*i-1);
// }
// Find the sum of the first N natural numbers.
// //    int n = 10;
//    int sum = 0;
//    for(int i =1; i<=10; i++){
//     sum = sum + i;
   
//    } System.out.println(sum);

// Find the sum of the first N even numbers.
//  int n = 10;
//    int sum = 0;
//    for(int i =1; i<=10; i++){
//     sum = sum +( 2*i);
   
//    } System.out.println(sum);
// Find the sum of the first N odd numbers.
// int n = 10;
//    int sum = 0;
//    for(int i =1; i<=10; i++){
//     sum = sum +( 2*i -1);
   
//    } System.out.println(sum);

// Calculate the factorial of a number.
// int num = 5;
// int factorial = 1;
// for(int i =1; i<=num;i++){
// factorial = factorial  *i;
// }System.out.println(factorial);

// Print the Fibonacci series up to N terms.
// int n = 11;
// int a = 0 ;
//  int b =1;
 
//    for(int i=1; i<=n; i++){
   
//     System.out.print(a + " ");
//     int c = a + b;
//     a = b;
//     b = c;
    
//    }

     

// Count the digits in a number.
// int num = 12345678;
// int count =0;
// while (num!=0) {
//     num = num/10;
//     count++;
// }System.out.println("digit in a number = " + count);
 
// Reverse a number.
// int num = 12345678;
// int reverse = 0;

// while (num!=0) {
//     reverse = reverse*10 + num%10;

//     num = num/10;
    
// }System.out.println("reverse number = " + reverse );

// Check whether a number is a palindrome.
// int num = 1221;

// int orignal = num;

// int reverse = 0;



// while (num!=0) {
//     reverse = reverse*10 + num%10;

//     num = num/10;


// }



// if(orignal == reverse){
//     System.out.println("Tish number is an palindrom");
// }else{
//     System.out.println("number is not palindrom");
// }

// Find the sum of digits.
// int num = 122143;

// int sum = 0;



// while (num!=0) {
//     sum = sum + num%10;

//     num = num/10;

// }System.out.println("Sum of digits = " + sum);


// Find the product of digits.
// int num = 122143;

// int product = 1;



// while (num!=0) {
//     product = product *( num%10);

//     num = num/10;

// }System.out.println("product of num = " + product);

// Find the largest digit in a number.

// int num = 179843;

// int largest = 0;

// while (num!=0) {
//   int   digit =  num%10;

//    if(digit>largest){
//     largest = digit;
//    }
//     num = num/10;

// }
    // System.out.println("Largest digit in num = " + largest);

// Find the smallest digit in a number.
// int num = 79843;

// int smallest = 9;

// while (num!=0) {
//   int   digit =  num%10;

//    if(digit<smallest){
//     smallest = digit;
//    }
//     num = num/10;

// }
//     System.out.println("smallest digit in num = " + smallest);

// Calculate a^b using loops.
// int a = 7;
// int b= 3;
// int result = 1;
// // System.out.println("a" + "^" + "b" + " = " + Math.pow(a, b));
// for(int i = 1;i<=b;i++){
//     result = result*a;
// }System.out.println("a"+ "^" + "b" + " = " + result);

// 🔴 Hard Level (20 Questions)

// Check whether a number is an Armstrong number.
//    int num = 153;
//    int original = num;

//    int sum = 0;
   
   
//    while (num!=0) {
//     sum = sum + (int)  Math.pow(num%10, 3);
//     num = num/10;
     
//    }if(sum==original){
//     System.out.println("Number is Armstrong");
//    }else{
//     System.out.println("NOt an armstrong ");
//    }
// Check whether a number is a Strong number.
int num = 145;
 
int original = num;
  int factorial =1;

   
   int sum = 0;
   int digit = 0;
   while (num!=0) {
   factorial =1;

     digit = num%10;

     for(int i =1;i<=digit;i++){
    factorial = factorial*i;
   
   }
   sum = sum + factorial;
    num/=10;

   
   }

   if(original==sum){
    System.out.println("Number is strong");
   }else{
    System.out.println("NOt an strong ");
   }
// Check whether a number is a Perfect number.
// Check whether a number is a Prime number.
// Print all prime numbers between 1 and N.
// Find the GCD (HCF) of two numbers.
// Find the LCM of two numbers.
// Check whether two numbers are co-prime.
// Reverse a number without using an extra variable for the reverse logic.
// Check whether a number is a Neon number.
// Check whether a number is a Spy number.
// Check whether a number is a Duck number.
// Find the frequency of each digit in a number.
// Remove all zeros from a number.
// Print the factors of a number.
// Count the factors of a number.
// Find the sum of all factors.
// Find the largest prime factor of a number.
// Check whether a number is both a palindrome and an Armstrong number.
// Print the Fibonacci series until the value exceeds N.
// 🔥 Mixed Practice Set (20 Questions)

// Is set me kisi bhi concept ka question aa sakta hai.

// Input five numbers and find the largest.
// Input five numbers and find the smallest.
// Find the average of five numbers.
// Count even and odd digits in a number.
// Count even and odd numbers from 1 to N.
// Print numbers divisible by both 3 and 5 from 1 to N.
// Find the sum of numbers divisible by 7 up to N.
// Print the reverse multiplication table of a number.
// Print the multiplication tables from 1 to 10.
// Find the sum of factorials from 1 to N.
// Check whether a number is both even and a palindrome.
// Check whether a number is prime and a palindrome.
// Find the difference between the sum of even digits and odd digits.
// Find the second largest among three numbers.
// Print all Armstrong numbers from 1 to N.
// Print all palindrome numbers from 1 to N.
// Print all perfect numbers from 1 to N.
// Print all Strong numbers from 1 to N.
// Print all numbers that are divisible by 2, 3, and 5 between 1 and N.
// Create a simple menu-driven calculator using switch and a loop.
    }
}
