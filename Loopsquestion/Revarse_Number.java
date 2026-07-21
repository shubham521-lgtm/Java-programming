// package Loopsquestion;

public class Revarse_Number {
    public static void main(String[] args) {
// revarse a number 

int num = 123456789;
int revarse = 0;
while (num!=0) {
    int digit = num%10;
    revarse = revarse * 10 + digit;
    num = num/10;

}
System.out.print(
        " revarse a number = " + revarse);

        
    }
}
