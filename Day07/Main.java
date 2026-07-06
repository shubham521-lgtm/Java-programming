
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Random rand = new Random();

        // int num = rand.nextInt(3,5); // 3 to 5

        // System.out.println("GAME NAME ROCK , PEPAR , SCISSOR");
        //  System.out.println("Rendom Number");
        // if(num == 3){
        //     System.out.println("Rock");
        // }
        
        // else if(num == 4){
            
        //     System.out.println("pepar");
        // }
        // else if( num ==5 ){

        //     System.out.println("scissor");
        // }



        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Enter your choice:");
        System.out.println("0 = Rock");
        System.out.println("1 = Paper");
        System.out.println("2 = Scissors");

        int user = sc.nextInt();
        int computer = rand.nextInt(3);

        System.out.println("Computer chose: " + computer);

        if (user == computer) {
            System.out.println("Draw!");
        }
        else if ((user == 0 && computer == 2) ||
                 (user == 1 && computer == 0) ||
                 (user == 2 && computer == 1)) {
            System.out.println("You Win!");
        }
        else {
            System.out.println("Computer Wins!");
        }

        
        
    



// import java.util.Scanner;
// import java.util.Random;

// public class RockPaperScissors {
    // public static void main(String[] args) {

    //     Scanner sc = new Scanner(System.in);
    //     Random rand = new Random();

    //     System.out.println("Enter your choice:");
    //     System.out.println("0 = Rock");
    //     System.out.println("1 = Paper");
    //     System.out.println("2 = Scissors");

    //     int user = sc.nextInt();
    //     int computer = rand.nextInt(3);

    //     System.out.println("Computer chose: " + computer);

    //     if (user == computer) {
    //         System.out.println("Draw!");
    //     }
    //     else if ((user == 0 && computer == 2) ||
    //              (user == 1 && computer == 0) ||
    //              (user == 2 && computer == 1)) {
    //         System.out.println("You Win!");
    //     }
    //     else {
    //         System.out.println("Computer Wins!");
    //     }

    //     sc.close();
    }
}