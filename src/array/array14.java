package array;

import java.util.Arrays;

public class array14 {
    public static void main(String[] args) {
//        ArrayList<Integer> l=new ArrayList<>();
        int[] arr={10,34,56,78,34,98};
        int left=0,right=arr.length-1;
        while (left<right){
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
        System.out.println(Arrays.toString(arr));
    }

}
