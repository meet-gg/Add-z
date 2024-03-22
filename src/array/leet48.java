package array;

public class leet48 {
    public static void main(String[] args) {
      int[][]  matrix = {{1,2,3},{4,5,6},{7,8,9}};
        int copyLength=matrix.length;  // This is n * n matrix so, we don't need column length
        // First we have to convert row --> column
        for(int i=0;i<copyLength;i++){
            for(int j=i;j<copyLength;j++){
                int temp =matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        // now we have to reverse the array.
        for(int i=0;i<copyLength;i++){
            for(int j=0;j<copyLength/2;j++){
                int temp = matrix[i][j];
                matrix[i][j]=matrix[i][copyLength-1-j];
                matrix[i][copyLength-1-j]=temp;
            }
        }
        for(int i=0;i<copyLength;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

    }
}
