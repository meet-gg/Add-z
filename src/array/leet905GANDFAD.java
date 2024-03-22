package array;

import java.util.Arrays;

public class leet905GANDFAD {
    public static void main(String[] args) {
       int[] nums = {3,1,0,4};
            int n = nums.length;
            int i = 0;
            int j = n - 1;
            while (i < j) {
                if (nums[i] % 2 == 0) {
                    i++;
                } else if (nums[j] % 2 != 0) {
                    j--;
                } else {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                    i++;
                    j--;
                }
            }
        System.out.println(Arrays.toString(nums));
    }
}
