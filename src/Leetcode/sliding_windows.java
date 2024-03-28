package Leetcode;

public class sliding_windows {
    public static void main(String[] args) {
        String blocks = "WBBWWBBWBW";
        int k = 7;
        System.out.println(minimumRecolors(blocks,k));
    }
    public static int minimumRecolors(String blocks, int k) {
        int min = Integer.MAX_VALUE;
        int count = 0;
        int j=0;
        int i=0;
        while(j<blocks.length() && i<blocks.length()){
            if (blocks.charAt(i) == 'W') {
                count++;
            }
            if(i>=k+j){
                min=Math.min(min,count);
                count=0;
                j++;
                i=j;
            }
            i++;
        }
        return min;
    }
}
