
import java.time.Year;
import java.util.Scanner;
public class PrecticeSet {
    public static void main(String[] args) {
    // int a = 10;
    //    if (a == 11){ 
// System.out.println("I AM 11");
    //    }
        // else{
            // System.out.println("I NOT 11");
        // }
        // System.out.println("Enter marks of three subject");
        // Scanner scan = new Scanner(System.in);
        // byte m1 ,m2,m3;
        // System.out.println("Enter mark of physics");
        //  m1 = scan.nextByte();
        //  System.out.println("Enter mark of Chemistry");
        //  m2 = scan.nextByte();
        //  System.out.println("Enter mark of Maths");
        //  m3 = scan.nextByte();
          
        //  System.out.println("Average of marks");
        //  float Average = (m1 + m2 + m3) /3.0f;
        //  System.out.println("Average  " + Average );
        //  if (Average>40 && m1>33 && m2>33 && m3>33){
        //   System.out.println("congretulation you are pass");
        //  }
        // else{System
        //     // System.out.println("sorry you  are not pass");
        // }

    //     System.out.println("Enter leep Year");
    //     Scanner sc = new Scanner(System.in);
    //     int year = sc.nextInt();
    //     if(year % 4 == 0 && year % 100 !=0 || year % 400 == 0){
          

    //         System.out.println("LEEP Year");
    //     } 
    // else
    //  {
    //           System.out.println("Not leep year");
    //     }
        
    Scanner sc = new Scanner(System.in);
    String website = sc.next();
    if(website.endsWith(".org")){
        System.out.println("this is organization website");
    }
    else if(website.endsWith(".com")){
        System.out.println("this is commarcial website");
    }
else if(website.endsWith(".in")){
    System.out.println("this is indian website");
}

    }

}
