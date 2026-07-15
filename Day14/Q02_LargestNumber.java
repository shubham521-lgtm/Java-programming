public class Q02_LargestNumber {
    public static void main(String[] args) {
        // Find the largest element in a 2D array.

        // int num = 125389;
        // int largest = 0;
        //  int digit = 0;

        //  while(num !=0){
        //     digit = num % 10;
        //     if(digit>largest){

        //     largest = digit;
        
        //  }
        //     num = num/10;

        //  }

        //  System.out.println("largest digit = " + largest);
         int [][] num = {
            {80 , 90},
            {99 , 100}
         };
         int largest = 0;

         for(int i = 0; i<num.length; i++){

            for(int j =0; j<num[i].length; j++){

                if(num[i][j]>largest){

                    largest = num[i][j];
                }

            }

    
            System.out.println("largest number = " + largest);


          
        }
    }
}
