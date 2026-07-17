public class Compound_interest {
    public static void main(String[] args) {
        //fine compound interest

        // a = p x (1 + r/100)^t
        // p=principle , r = rate , t = time

        double p = 5000;
        double rate = 10;
        double t = 2;

        double a = p* Math.pow(1 + rate/100 ,t);
        

        
          double compound_interest = a - p;
        System.out.println("Compound interest = " + compound_interest);
    }
}
