package array;

import java.util.Arrays;

public class array16 {
    public static void main(String[] args) {
        int[] arr = {23, 435, 57,56 , 83, 13};
        int[] arr2=new int[2*arr.length];
        for (int i=0;i<arr.length;i++){
            arr2[i]=arr[i];
            arr2[arr.length+i]=arr[i];
        }
        System.out.println(Arrays.toString(arr2));
    }
}