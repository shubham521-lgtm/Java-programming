public class Armstrong_number {
    public static void main(String[] args) {
// Q8. Check Armstrong number.
        int num = 153;
        
        int original = num;
        double sum = 0;
        while (num!=0) {
              int digit = num%10;
             sum = sum + Math.pow( digit,3);

            num = num /10;

            
        }
       
        if(original == sum){
        System.out.println("number is armstrong");

        }
        else{
            System.out.println("number is not armstrong");
        }
    }
}
