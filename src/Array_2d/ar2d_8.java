package Array_2d;

public class ar2d_8 {
    public static void main(String[] args) {
        int[][] a={{1,2,3},
                {4,5,6},
                {7,8,9}};
        int row=a.length;
        int col=a[0].length;
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++) {
                if (i% 2 == 0)
                {
                    System.out.print(a[i][j]+" ");
                }
                else {
                    System.out.print(a[i][col-j-1]+" ");
                }
            }
            System.out.println();
        }
    }
}