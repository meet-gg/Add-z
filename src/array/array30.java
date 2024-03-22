package array;

import java.util.Arrays;
public class array30 {
    public static void main(String[] args) {
        int[] num={2,6,4,7,3,9,3};
        int left=0,right= num.length-1;
        while (left<right){
            if (num[left]%2!=0){
                left++;
            }
            else if (num[right]%2==0){
                right--;
            }
            else{
                int temp=num[left];
                num[left]=num[right];
                num[right]=temp;
            }
        }
        System.out.println(Arrays.toString(num));
    }
}
