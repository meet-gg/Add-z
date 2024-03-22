package Leetcode;

public class leet2859 {
    public static void main(String[] args) {
       int[] nums = {4,3,2,1};
        int k = 2;
        int j=0;
        int sum=0;
        for (int i=0;i< nums.length;i++){
            j=i;
            int l=0;
            while(j>0){
              int  ans=j%2;
                j/=2;
                if (ans==1){
                    l++;
                }
            }
           if (l==k){
            sum+=nums[i];
           }
        }
        System.out.println(sum);
    }
}
