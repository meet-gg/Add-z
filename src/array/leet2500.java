package array;

import java.util.Arrays;

public class leet2500 {
    public static void main(String[] args) {
        int[][] arr={{1,2,4},{3,3,1}};
        int row = arr.length;
        int colum = arr[0].length;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < colum; j++) {
                Arrays.sort(arr);
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
