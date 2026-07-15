public class Q04_SumOfRow {
    public static void main(String[] args) {
 //  Calculate the sum of each row.

 int [][] num = {
    {30 , 20},
    {40 , 50}
 };


 for(int i =0; i<num.length;i++){
   
    int sum = 0;
    
    for(int j = 0; j<num[i].length; j++){
        sum = sum + num[i][j];
    }
 System.out.println("sum of Row " + (i +1) + " = " + sum);

 }

// Print the transpose of a matrix.
// Check whether two matrices are equal.
// Add two 3 × 3 matrices.
    }
}
