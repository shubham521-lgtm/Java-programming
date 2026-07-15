public class Q03_SmallestNumber {
    public static void main(String[] args) {

        // Find the smallest element in a 2D array.

        int [][] num = {
            {80 , 90},
            {9 , 100}
         };
         int smallest = num[0][0];

         for(int i = 0; i<num.length; i++){

            for(int j =0; j<num[i].length; j++){

                if(num[i][j]<smallest){

                    smallest = num[i][j];
                }

            }

         }

            System.out.println("smallest number = " + smallest);

    }
}
