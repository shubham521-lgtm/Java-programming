// package Loopsquestion;

public class Count_digit {
    public static void main(String[] args) {
// Q5. Count digits.
        int num = 123456789;
         int Count = 0;
        while (num!=0) {
            int digit = num%10;

            Count++;
            num = num/10;

        }
        System.out.println("total digit = " +Count);
            

    }
}
