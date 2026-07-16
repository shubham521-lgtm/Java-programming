// package Day15;

public class Q01_TransposeOfMatrix {
    public static void main(String[] args) {
        //  Print the transpose of a matrix.
        int [][] matrix = {
            {71 , 87 , 29},
            {88 , 98 , 20},
            {65 , 28 ,89 }
        };

        int[][]transpose = new int[matrix[0].length][matrix.length];

        for(int i = 0; i<matrix.length;i++){

            
            for(int j =0; j<matrix[i].length; j++){

                transpose[j][i]=matrix[i][j];
            }
            
        }
        System.out.println("transpose of matrtix");
       
        for(int i =0; i<transpose.length;i++){

            for(int j =0; j<transpose[i].length;j++){

                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();        }

    }
}
