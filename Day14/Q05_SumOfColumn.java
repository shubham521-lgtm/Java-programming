public class Q05_SumOfColumn {
    public static void main(String[] args) {
    //   calculate the sum of each column
//         int [][] num = {
//     {30 , 80},
//     {40 , 50}
//  };


//  for(int i =0; i<num.length;i++){
   
//     int sum = 0;
    
    
//     for(int j = 0; j<num[i].length; j++){
//         sum = sum + num[j][i];
//     }
//  System.out.println("sum of column " + (i + 1) + " = " + sum);

//  }


int[][] num = {
    {30, 70},
    {40, 50}
};

for (int col = 0; col < num[0].length; col++) {

    int sum = 0;

    for (int row = 0; row < num.length; row++) {
        sum += num[row][col];
    }

    System.out.println("Sum of column " + (col + 1) + " = " + sum);
}
    }
}
