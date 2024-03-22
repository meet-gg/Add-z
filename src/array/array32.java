package array;

public class array32 {
    public static void main(String[] args) {
        int[] num={1,2,3,4,4,5,6,7};
        int n=7,sum=0;
        int nsum=(n*(n+1))/2;
        for (int i=0;i<num.length;i++){
            sum+=num[i];
        }
        System.out.println(sum-nsum);
    }
}
