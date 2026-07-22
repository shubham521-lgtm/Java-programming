package AlltopicsMixedproble;

public class Revarse_number {
    public static void main(String[] args) {
        // Q10. Reverse a number.
int num = 1234567;
int Reverse = 0;
while (num!=0) {
    int digit = num%10;
    Reverse = Reverse*10 + digit;
    num/=10;
    
    
}
System.out.println("revaese = " + Reverse);
    }
}
