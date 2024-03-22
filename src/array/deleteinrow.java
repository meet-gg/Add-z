package array;

public class deleteinrow {
    public static void main(String[] args) {
        int[][]  matrix = {{1,3,2},{7,9,8},{4,6,5}};
        int row= matrix.length;
        int col= matrix[0].length;
        for(int i=0;i<col;i++){
            int max=Integer.MIN_VALUE;
            int index=0;
            for (int j=0;j<row;j++){
                if (matrix[j][i] > max) {
                    max = matrix[j][i];
                    index = j;
                }
            }
            for(int j=index;j<row-1;j++){
                matrix[j][i]=matrix[j+1][i];
            }
            matrix[row-1][i]=max;
        }
        for (int i=0;i<row-1;i++){
            for (int j=0;j<col;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
