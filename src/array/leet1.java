package array;

public class leet1 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,4,4,5,6,6,6,7,7};
        int count=0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                    break;
                }
            }
        }
        System.out.println(nums.length-count);
    }
}