package Leetcode;

import java.util.Arrays;

public class leet283 {
    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12,0,9,67,4,0,56,87,0,65,0,67,78,23,0,43,56,98,0,89,0};
        int[] num1=new int[nums.length];
        int j=0;
        for (int i=0;i< nums.length;i++){
            if (nums[i]>0){
                num1[j]=nums[i];
                j++;
            }
        }
        System.out.println(Arrays.toString(num1));
    }
}