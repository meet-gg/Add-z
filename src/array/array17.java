package array;

import java.util.Arrays;
public class array17 {
    public static void main(String[] args) {
        int[] arr1 = {23, 435, 57,56 , 83, 13};
        int[] arr2 = {25, 43, 50,567 , 75, 31};
        int[] arr3 = new int[2*arr1.length];
        int j=0;
        for (int i=0;i<arr1.length;i++){
            arr3[j]=arr1[i];
            j++;
            arr3[j]=arr2[i];
            j++;
        }
        System.out.println(Arrays.toString(arr3));
        }
}
