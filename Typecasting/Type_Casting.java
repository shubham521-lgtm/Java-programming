// package Typecasting;

import java.net.Socket;
import java.nio.channels.Pipe.SourceChannel;

public class Type_Casting {
    public static void main(String[] args) {
//         Type Casting (10 Questions)
// Easy

// Q1. Convert int to double.

int a = 88;
double b = a;
System.out.println("double value = "+ b);

// Hard

// Q7. Convert a decimal number into an integer using explicit casting.
    float num = 5.78f;
    int num1 = (int)num;
    System.out.println("decimal value = " +num);
    System.out.println("integer  value = " +num1);



// Q8. Convert ASCII value into character.
int ASCII = 66;
char ch = (char)ASCII;
System.out.println("ASCII value = "+ASCII);
System.out.println("character = "+ch);

// Q9. Convert int → double → int.
// System.out.println("int to double ");
// int i = 66;
// double d = i;
// System.out.println("value of int = " +i);
// System.out.println("value of double = "+d);

// System.out.println("double to int ");
// int B = (int)d;
// System.out.println("int B = " + B);


// Q10. Write a program that demonstrates implicit and explicit type casting together

System.out.println("implicit type casting");
int num3 = 29999;

double num4 = num3;
  System.out.println("value of double = "+num4);

  System.out.println("expicit casting");

  long L = 100000000000l;

  int number = (int)L;

  System.out.println("value of int " + number);
    }
}
