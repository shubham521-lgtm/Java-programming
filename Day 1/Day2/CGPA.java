
import java.util.Scanner;
public class CGPA {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter marks of sub1");
        float sub1 = sc.nextFloat();

        System.out.println("Enter marks of sub2");
        float sub2 = sc.nextFloat();

        System.out.println("Enter marks of sub3");
        float sub3 = sc.nextFloat();

        float average = (sub1 + sub2 + sub3)/3;
        float cgpa = average / 9.5f;

        System.out.println("Average marks = " + average);
        System.out.println("CGPA =" + cgpa);

    }
}