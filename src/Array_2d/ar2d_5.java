package Array_2d;

public class ar2d_5 {
    public static void main(String[] args) {
        int[][] a={{1,2,3},
                {4,5,6},
                {7,8,9}};
        int row=a.length;
        int col=a[0].length;
        for(int i=row-1;i>=0;i--)
        {
            for(int j=col-1;j>=0;j--) {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}