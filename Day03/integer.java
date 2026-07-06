import java.util.Scanner;

public class integer {

    public static void main(String[] args) {
        // System.out.println("Integer number");

        // Scanner sc = new Scanner(System.in);
        // boolean num1 = sc.hasNextInt();
        // System.out.println(num1);

        // quetion 2
        Scanner sc = new Scanner(System.in);
         System.out.println("Enter distance in kilometter");
        
         double km = sc.nextDouble();

         double miles = km * 0.621371;
         System.out.println("Miles " + miles); 


        

    }
}