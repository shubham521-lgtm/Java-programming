public class Q05_SumOfColumn {
    public static void main(String[] args) {
    //   calculate the sum of each column
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
    }
}
