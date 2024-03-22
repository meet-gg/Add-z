package array;

import java.util.Arrays;

public class leet1200 {
    public static void main(String[] args) {
        int[] arr = {4,2,1,3};
        Arrays.sort(arr);
        int c=0;
        for (int i=arr.length-1;i>0;i--){
                c=arr[arr.length-1]-arr[arr.length-2];
        }
    }
}