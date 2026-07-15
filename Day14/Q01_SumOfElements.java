public class Q01_SumOfElements {
    public static void main(String[] args) {

        // Find the sum of all elements in a 3 × 3 array.
        int [][] elements = { 
            {43 , 54 , 76},
            {65 ,43 , 32 },
            {41 ,40 , 30 }
         };
        
         int sum = 0;

         for(int i = 0;i<elements.length;i++){

            for(int j=0;j<elements[i].length; j++){
             
             
                sum = sum +elements[i][j];
            }

         }

         System.out.println("sum = " + sum);
    }
}
