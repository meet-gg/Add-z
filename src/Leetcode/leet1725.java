package Leetcode;

public class leet1725 {
    public static void main(String[] args) {
       int[][] rectangles = {{5,8},{3,9},{5,12},{16,5}};
        int row=rectangles.length;
        int col=rectangles[0].length;
        for(int i=0;i<row;i++){
            int min=Integer.MAX_VALUE;
            for(int j=0;j<col;j++){
                min=Math.min(min,rectangles[i][j]);
            }
            System.out.println(min);
        }
    }
}
