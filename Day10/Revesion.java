
 import java.util.Scanner;
public class Revesion {
   

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter name ");
        String name = scan.nextLine();

        System.out.print("Enter age ");
        int age = scan.nextInt();

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    
        System.out.println("Enter num1");
        int num1 = scan.nextInt();
        System.out.println("Enter num2");
        int num2 = scan.nextInt();
        System.out.println("Enter num3");
        int num3 = scan.nextInt();
        
        int Average = (num1 + num2 + num3)/3;
        System.out.println("Average: " + Average);


//         Input:
// 10
// 20

// Output:
// 10 > 20 = false
// 10 < 20 = true
// 10 >= 20 = false
// 10 <= 20 = true
// 10 == 20 = false
// 10 != 20 = true

System.out.println("Enter number1");
        int number1 = scan.nextInt();
        System.out.println("Enter number2");
        int number2 = scan.nextInt();

        System.out.println(number1 + " > " + number2 + " = " + (number1 > number2));
        System.out.println(number1 + " < " + number2 + " = " + (number1 < number2));
        System.out.println(number1 + " >= " + number2 + " = " + (number1 >= number2));
        System.out.println(number1 + " <= " + number2 + " = " + (number1 <= number2));
        System.out.println(number1 + " == " + number2 + " = " + (number1 == number2));
        System.out.println(number1 + " != " + number2 + " = " + (number1 != number2));
}
}
