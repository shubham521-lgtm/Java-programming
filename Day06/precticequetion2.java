

import java.util.Scanner;

public class precticequetion2 {
    public static void main(String[] args) {
//         Type Casting Practice Questions
// Easy
// Convert an int to a float.
// int a = 10;
// float b = a;
// System.out.println(b);


// Convert a char to an int.
// char ch = 'A';
// int num = ch;

// Q3 int to double 

// int num = 100;
// double d = num;
// System.out.println(d);
// System.out.println(num);

// Q4 double to int 
// double d = 100.75;
// int num = (int)d;
// System.out.println(num);

// float to int 
// float f = 23.99f;
// int num = (int)f;
// System.out.println(num);


// int to char 
// int num = 66;
// char ch = (char)num;
// System.out.println(ch);


// Store an int value in a double variable.

// int value = 40;
// double D = (double)value;
// System.out.println(D);


// Medium
// Convert a float value (45.78) to int.
// float value = 45.78f;
// int num = (int)value ;
// System.out.println(num);


// Convert a double to float.
// double value = 30.30;
// float f = (float)value;
// System.out.println(f); 

// Print the character corresponding to an ASCII value.
//  int value = 67;
//  char ch = (char)value;
//  System.out.println("ASCII value  = " + value);
//  System.out.println("character = " + ch);


// Hard
// Take a float input and convert it to int.
// Scanner sc = new Scanner(System.in);

// System.out.println("Enter floating value");
// float value = sc.nextFloat();
// int num = (int)value;


// System.out.println("integer = " + num);

 
// Print the ASCII value of character 'A'.
// System.out.println("Enter ASCII Value");
//   int ASCII = sc.nextInt();
  
//   char ch = (char)ASCII;
//   System.out.println("Character = " + ch);


// Convert ASCII value 97 into a character.
//  int ASCII = 97;
//  char ch = (char)ASCII;
//  System.out.println("character = " + ch);

// Operators Practice Questions

// Easy
// Add two numbers.
// int a = 8;
// int b = 8;
// int c = a+b;
// System.out.println(c);


// Subtract two numbers.
// int a = 8;
// int b = 9;
// int c = a-b;
// System.out.println(c);
// Multiply two numbers.
// int a = 8;
// int b = 9;
// int c = a*b;
// System.out.println(c);
// Divide two numbers.
// int a = 8;
// int b = 9;
// float c = a/b;
// System.out.println(c);
// Find the remainder using the modulus operator.
// int a = 9;
// int b = 8;
// float c = a%b;
// System.out.println(c);
// Medium
// Check whether a number is even or odd.
//  ternary operator 
// conditin ? value 1: value2 :
// condition true -- value 1
// condition fals -- value2
//    int num = 8;

// System.out.println((num % 2 == 0) ? "Even" : "Odd");

   
// Find the greater number between two numbers.
//  int a = 70;
//  int b = 60;
//  int greater =(a>b) ? a:b;
 
// System.out.println(greater);
// Check whether a number is positive, negative, or zero.
// int num = 0;
 
//  System.out.println(
    // (num > 0) ? "Positive" :
    // (num < 0) ? "Negative" :
    // "Zero"
// );
// Hard
// Find the largest among three numbers.
// int a = 8;
// int b = 9;
// int c =19;
// System.out.println(
//     (a > b) ? "largest" :
//     (b >c) ?  "lowest"  :
//     "largest"
// );
// int a = 10;
// int b = 25;
// int c = 15;

// int largest = (a > b)
//                 ? ((a > c) ? a : c)
//                 : ((b > c) ? b : c);

// System.out.println("Largest number = " + largest);
// Check whether a year is a leap year.
// int year = 2024;

// System.out.println(
//     ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
//     ? "Leap Year"
//     : "Not a Leap Year"
// );
// To calculate a leap year, apply the following three rules: if a year is divisible by 4, it is a leap year. However, if it is also divisible by 100, it is not a leap year, unless it is also divisible by 400. 
// Check whether a number is divisible by both 5 and 11.
// int num = 55;

// System.out.println(
    // (num % 5 == 0 && num % 11 == 0)
    // ? "Divisible by both 5 and 11"
    // : "Not divisible by both 5 and 11"
// );
// Input/Output Practice Questions
// Easy
// Take a name as input and print it.
Scanner scan = new Scanner(System.in);
// System.out.println("Enter num1");
// String name  = scan.nextLine();
// System.out.println("My name is");
// System.out.println(name);
// Take age as input and print it.
// int age = scan.nextInt();
// System.out.println("MY AGE");
// System.out.println(age);
// Take two numbers as input and print their sum.

// System.out.println("Enter num1");
// int num1 = scan.nextInt();

// System.out.println("Enter num2");
// int num2 = scan.nextInt();

// System.out.println("sum of num1 and num2");

// int sum = (num1+num2);
// System.out.println(sum);

// Medium
// Take length and width as input and calculate rectangle area.

// System.out.println("Enter length");
// float L = scan.nextFloat();
// System.out.println("Enter width");
// float W = scan.nextFloat();
// System.out.println("Area of rectangle");
// float area =(L*W);
// System.out.println("area = " + area);

// Take radius as input and calculate circle area.
// System.out.println("Enter redius");
// float r = scan.nextFloat();
// System.out.println("Enter value of pi");
// float pi = scan.nextFloat();
// System.out.println("redius of circule");
// float area =(r*r*pi); 
// System.out.println("area = " + area);
// Create a temperature conversion program.

        

        // System.out.print("Enter temperature in Celsius: ");
        // double celsius = scan.nextDouble();

        // double fahrenheit = (celsius * 9 / 5) + 32;

        // System.out.println("Temperature in Fahrenheit: " + fahrenheit);

    
    

// Hard
// Take marks and calculate percentage.
System.out.println("Enter mark of physics");
int sub1 = scan.nextInt();
System.out.println("Enter mark of Hindi");
int sub2 = scan.nextInt();
System.out.println("Enter mark of English");
int sub3 = scan.nextInt();
System.out.println("Enter mark of Maths");
int sub4 = scan.nextInt();
System.out.println("Enter mark of Chemistry");
int sub5 = scan.nextInt();
System.out.println("percentage");
float parcentage = (sub1 + sub2 + sub3 + sub4 + sub5) / 5;
System.out.println(parcentage);


// Take marks of 5 subjects and calculate average.
// Create a CGPA calculator.
// 

    }
}
