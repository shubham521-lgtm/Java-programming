// package Controlestatemnt;

import java.util.Scanner;

public class Calculator_using_Switch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter num1 ");
        int num1 = scan.nextInt();
        System.out.println("Enter num2");
        int num2 = scan.nextInt();
        System.out.println("Enter oparetor");
        char oparetor = scan.next().charAt(0);

        switch (oparetor) {
            case '+':
                System.out.println("sum of to num " +(num1 + num2));
                break;
                case '-':
                System.out.println( num1 - num2);
                break;
                case '*':
                System.out.println(num1 * num2);
                break;
                case '/':
                System.out.println(num1 / num2);
                break;
                case '%':
                System.out.println(num1 % num2);
                break;
        
            default:
                System.out.println("invalide oparetor");
                break;
        }
    }
}
