package Array_2d;

public class ar2d_3 {
    public static void main(String[] args) {
        int[][] a={{1,2,3},
                {4,5,6},
                {7,8,9}};
        int row=a.length;
        int col=a[0].length;
        int key=7;
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                if(a[i][j]==key)
                {
                    System.out.println("present");
                    return;
                }
            }
        }
        System.out.println("not present");
    }
}