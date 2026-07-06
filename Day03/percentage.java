
import java.util.Scanner;

public class percentage {
    public static void main(String[] args) {
        System.out.println("Taking input from the user");

         Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter marks of 5 subjects:");

        int sub1 = sc.nextInt();
        int sub2 = sc.nextInt();
        int sub3 = sc.nextInt();
        int sub4 = sc.nextInt();
        int sub5 = sc.nextInt();

        int percentage = (sub1 + sub2 + sub3 + sub4 + sub5) / 5;

        System.out.println("Percentage = " + percentage + "%");

    }
}
