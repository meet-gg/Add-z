package array;

import java.util.Arrays;
//Copy array element in another array
public class array11 {
    public static void main(String[] args) {
        int[] marks={12,23,56,34,45};
        int[] roll=new int[marks.length];
        for (int i=0;i<marks.length;i++){
            roll[i]=marks[i];
        }
            System.out.println(Arrays.toString(roll));
    }
}