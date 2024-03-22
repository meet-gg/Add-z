package array;

import java.util.Arrays;

public class selectionsort {
    public static void selectionsort(int[] num) {
        int min;
        for (int i = 0; i < num.length; i++) {
            min = i;
            for (int j = i + 1; j < num.length; j++) {
                if (num[min] > num[j]) {
                    min = j;
                }
            }
            int temp = num[i];
            num[i] = num[min];
            num[min] = temp;
        }
    }

        public static void main (String[]args){
            int[] num = {23, 56, 3, 8, 56, 96};
            selectionsort(num);
            System.out.println(Arrays.toString(num));
        }
    }
