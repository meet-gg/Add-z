package Leetcode;

public class leet2455 {
    public static void main(String[] args) {
        int[] arr={1,3,6,10,12,15};
        int sum=0,n=0;
        for (int i=0;i<arr.length;i++){
            if (arr[i]%2==0&&arr[i]%3==0){
                sum+=arr[i];
                n++;
            }
        }
        System.out.println(sum/n);
    }
}
