public class DecimalNumber {
    public static void main(String[] args) {
        
// Q5. Store a decimal number in float and double and compare.
        float f = 699.99007f;
        double d = 88.99999;

        if(Math.abs(f-d)<0.0001){
            System.out.println("both are equal");

        }else
        {
            System.out.println("both are not equal");
        }

    }
}
