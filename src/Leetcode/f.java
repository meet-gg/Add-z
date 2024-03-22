package Leetcode;

import java.util.HashMap;

public class f {
    public static int subarraysDivByK(int[] nums, int k) {
        int rem = 0;
        int sum = 0;
        int ans = 0;
        HashMap<Integer, Integer> mp = new HashMap<>();
        mp.put(rem, 1);

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            rem = sum % k;
            if (rem < 0) {
                rem += k;
            }
            if (mp.containsKey(rem)) {
                ans += mp.get(rem);
            }
            mp.put(rem, mp.getOrDefault(rem, 0) + 1);
        }
        System.out.println(mp);
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {4, 5, 0, -2, -3, 1};
        int k = 5;
        System.out.println(subarraysDivByK(nums, k)); // Output should be 7
    }
}

