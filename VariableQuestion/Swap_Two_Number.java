public class Swap_Two_Number {
    public static void main(String[] args) {
// Q3. Swap two numbers using a third variable.
        int a =30;
        int b = 40;

        System.out.println("Before swapping ");
        System.out.println("a = " + a);
        System.out.println("b = " + b);


        int c ;
            c = a;
            a = b;
            b = c;

         System.out.println("after swapping ");
         
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
