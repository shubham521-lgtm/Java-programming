package AlltopicsMixedproble;

public class Digit_count {
    public static void main(String[] args) {
    

//
// Q7. Count digits.
int num = 1234567;
int Count = 0;
while (num!=0) {
    int digit = num%10;
    num/=10;
    Count++;
    
}
System.out.println(Count);
    }
}
