package AlltopicsMixedproble;

public class Sum_of_digit {
    public static void main(String[] args) {
        // Q8. Sum of digits.
int num = 1234567;
int sum = 0;
while (num!=0) {
    int digit = num%10;
    sum = sum + digit;
    num/=10;
    
    
}
System.out.println(sum);
    }
}
