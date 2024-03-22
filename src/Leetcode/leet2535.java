package Leetcode;

public class leet2535 {
    public static void main(String[] args) {
        int[] arr = {11,23,4,5,7};
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        System.out.println(sum);
        int sum2=0;
        for (int i = 0; i < arr.length; i++) {
            while (arr[i]>0){
                int r=arr[i]%10;
              sum2+=r;
              arr[i]/=10;
            }
        }
        System.out.println(sum2);
        System.out.println(sum-sum2);
    }
}
