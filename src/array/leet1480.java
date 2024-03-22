package array;

import java.util.Arrays;

public class leet1480 {
    public static void main(String[] args) {
      int[]  nums = {1,2,3,4};
        int[] k=new int[nums.length];
      for(int i=0;i< nums.length;i++){
          for (int j=0;j<=i;j++){
              k[i]+=nums[j];
          }
      }
        System.out.println(Arrays.toString(k));
    }
}