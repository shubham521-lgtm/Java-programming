package AlltopicsMixedproble;

public class Product_of_digit {
    public static void main(String[] args) {
        //  Q9. Product of digits.
int num = 1234567;
int Product = 1;
while (num!=0) {
    int digit = num%10;
    Product = Product * digit;
    num/=10;
    
    
}
System.out.println("product = " + Product);
    }
}
