// package Controlestatemnt;
import java.util.Scanner;;
public class Control_Statement {
    public static void main(String[] args) {

// Q1. Check whether a number is positive or negative.
// System.out.println("Enter an number ");
// Scanner scan = new Scanner(System.in);

// int num = scan.nextInt();

// if (num >0){
//     System.out.println("Number is posetive = "+num);

// }else{
//     System.out.println("Number is nagetive = " + num);
// }


// Ternary Operator



// break & continue

// Q9. Print numbers from 1–20 but stop when 12 comes.
// for (int i = 1; i<=20; i++){
//     System.out.println(i);

//     if(i==12){
//         break;
//     }
// }

// Q10. Print numbers from 1–20 but skip multiples of 3
for (int i = 1; i<=20; i++){

    if(i %3==0){
        continue;
    }
    System.out.println(i);

}

    }
}
