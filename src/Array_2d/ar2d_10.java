package Array_2d;

public class ar2d_10 {
    public static void main(String[] args) {
        int[][] a={{1,2,3},
                {4,5,6},
                {7,8,9}};
        int row=a.length;
        int col=a[0].length;
        int[] arr=new int[row];
        for(int i=0;i<col;i++)
        {
            int sum=0;
            for(int j=0;j<row;j++)
            {
                sum+=a[j][i];
            }
            arr[i]=sum;
        }
        int max=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(max<arr[i])
            {
                max=arr[i];
            }
        }
        System.out.println(max);
    }
}