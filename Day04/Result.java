
import java.util.Scanner;
public class Result {
    public static void main(String[] args) {
    //     byte X = 5;
    //     int Y = 6;
    //     short Z = 8;
    //     int a = Y + Z;
    //     float b = 6.54f + X;
    //     System.out.println(b);

    // increament and decrement operaores

// int y = 7;
// int x = ++y*8;
// System.out.println(x);


System.out.println("MARKS OF ALL SUBJECT");

Scanner scan = new Scanner(System.in);

System.out.println("mark of physics");
int mark1 = scan.nextInt();
System.out.println("mark of english");
int mark2 = scan.nextInt();

System.out.println("mark of chemistry");
int mark3 = scan.nextInt();

System.out.println("mark of Maths");
int mark4 = scan.nextInt();

System.out.println("mark of hindi");
int mark5 = scan.nextInt();

float percentage = (mark1 + mark2 + mark3 + mark4 + mark5) / 5;
System.out.println("percentage " + percentage + "%");


    }
}
