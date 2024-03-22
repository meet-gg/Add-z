package array;// How Many Numbers Are Smaller Than the Current Number
import java.util.Arrays;
public class array15 {
    public static void main(String[] args) {
        int[] mark = {23, 435, 57,56 , 83, 13};
        int[] arr2=new int[mark.length];
        for (int i = 0; i < mark.length; i++) {
            for (int j = 0; j < mark.length; j++) {
                if (mark[i] > mark[j]) {
                    arr2[i]++;
                }
            }
        }
        System.out.println(Arrays.toString(arr2));
    }
}