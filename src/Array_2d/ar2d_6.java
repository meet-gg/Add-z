package Array_2d;

public class ar2d_6 {
    public static void main(String[] args) {
        int[][] a={{1,2,3},
                {4,5,6},
                {7,8,9}};
        int row=a.length;
        int col=a[0].length;
        for(int i=0;i<col;i++)
        {
            for(int j=0;j<row;j++)
            {
                System.out.print(a[j][i]+" ");
            }
            System.out.println();
        }
    }
}