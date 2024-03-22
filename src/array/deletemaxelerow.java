package array;

public class deletemaxelerow {
    public static void main(String[] args) {
        int[][]  matrix = {{1,3,2},{4,6,5},{7,9,8}};
        int row= matrix.length;
        int col= matrix[0].length;
        for(int i=0;i<row;i++){
            int max=Integer.MIN_VALUE;
            int index=0;
            for (int j=0;j<col;j++){
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                    index = j;
                }
            }
            for(int j=index;j<col-1;j++){
                matrix[i][j]=matrix[i][j+1];
            }
            matrix[i][col-1]=max;
        }
        for (int i=0;i<row;i++){
            for (int j=0;j<col-1;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}