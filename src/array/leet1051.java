package array;

import java.util.Arrays;
public class leet1051 {
    public static void main(String[] args) {
        int[] heights = {1,2,3,4,5};
        int[] h2=new int[heights.length];
        int count=0;
        for (int i=0;i<heights.length;i++){
            h2[i]=heights[i];
        }
        Arrays.sort(h2);
        for (int i=0;i<h2.length;i++){
            if (h2[i]!=heights[i]){
                count++;
            }
        }
        System.out.println(count);

    }
}
