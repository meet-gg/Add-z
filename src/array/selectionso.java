package array;

import java.util.Arrays;

public class selectionso {
    public static void main(String[] args) {
        int[] arr={5,2,7,4,9,6,3,5,7,8};
        for (int i=0;i<arr.length-1;i++){
            int min=i;
                for (int j=i+1;j<arr.length;j++){
                    if (arr[min]>arr[j]){
                        min=j;
                    }
                }
                if(min!=i) {
                    int temp = arr[i];
                    arr[i] = arr[min];
                    arr[min] = temp;
                }
        }
        System.out.println(Arrays.toString(arr));
    }
}
