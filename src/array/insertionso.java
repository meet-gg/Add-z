package array;

import java.util.Arrays;

public class insertionso {
    public static void main(String[] args) {
        int[] arr={5,2,7,4,9,6,3,5,7,8};

        for (int i=1;i<arr.length;i++){
            int temp=arr[i];
            int j=i-1;
            while (j>=0 && arr[j]>temp){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
