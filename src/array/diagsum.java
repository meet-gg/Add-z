package array;

public class diagsum {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3},
                {5, 6, 7},
                {9, 10, 11},
                };
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i][i];
           sum+=arr[i][arr.length-1-i];
           if (i==arr.length-1-i){
               sum-=arr[i][arr.length-1-i];
           }
        }
        System.out.println(sum);
    }
}
