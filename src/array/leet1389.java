package array;

import java.util.ArrayList;
public class leet1389 {
    public static void main(String[] args) {
        int[] nums ={1,2,3,4,0};
        int[] index = {0,1,2,3,0};
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            list.add(index[i],nums[i]);
        }
        System.out.println(list);
    }
}
