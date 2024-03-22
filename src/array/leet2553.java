package array;

import java.util.ArrayList;
import java.util.Arrays;

public class leet2553 {
    public static void main(String[] args) {
        int[] nums = {13, 25, 83, 77};
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = nums.length - 1; i >= 0; i--) {
            while (nums[i] > 0) {
                int r = nums[i] % 10;
                nums[i] /= 10;
                list.add(r);
            }
        }
        int[] ans=new int[list.size()];
        int j=0;
        for (int i=list.size()-1;i>=0;i--){
           ans[j]= list.get(i);
           j++;
        }
        System.out.println(Arrays.toString(ans));
    }
}
