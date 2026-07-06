import java.util.Scanner;
public class Student {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
         System.out.println("Enter mark or 5 subject");

         int sub1 = sc.nextInt();
         int sub2= sc.nextInt();  
        int sub3 = sc.nextInt();
         int sub4= sc.nextInt();
         int sub5= sc.nextInt();
           
         float Student = (sub1 + sub2 + sub3 + sub4 + sub5) / 5;

         System.out.println("percentage of student");
         System.out.println(Student);
         System.out.println("%");
    }
}
