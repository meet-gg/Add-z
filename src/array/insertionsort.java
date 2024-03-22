package array;

import java.util.Arrays;

public class insertionsort {
    public static void main(String[] args) {
        int[] num={2,6,4,7,3,9,3};
        for (int i=1;i< num.length;i++) {
            int temp = num[i];
            int j = i - 1;
            for (; j >= 0 && num[j] > temp; j--) {
                num[j + 1] = num[j];
            }
            num[j+1]=temp;
        }
        System.out.println(Arrays.toString(num));
    }
}
