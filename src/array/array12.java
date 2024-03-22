package array;

import java.util.Arrays;

public class array12 {
    public static void main(String[] args) {
        int[] marks = {12, 23, 56, 34, 45,22};
        int[] roll = new int[marks.length];
//        for (int i = 0; i < marks.length; i++) {
//            if (marks[i] % 2 != 0) {
//                roll[i] = marks[i];
//                System.out.println(roll[i]);
//            }
//        }
//        for (int i = 0; i < marks.length; i++) {
//            if (marks[i] % 2 == 0) {
//                roll[i] = marks[i];
//                System.out.println(roll[i]);
//            }
//        }
//        System.out.println(Arrays.toString(roll));
//    }
        int left = 0, right = marks.length - 1;
        while (left < right) {
            if (marks[left] % 2 == 0 )
                left++;
            if (marks[right] % 2 != 0)
                right--;
            if (left < right) {
                int temp = marks[left];
                marks[left] = marks[right];
                marks[right] = temp;
            }

        }

        System.out.println(Arrays.toString(marks));
    }
}