package array;

import java.util.Arrays;
public class Rowsort {
    public static void main(String[] args) {
       int[][] grid= {{1,3,2},{6,7,8},{5,4,8}};
       int row= grid.length;;
       int col= grid[0].length;
//        for(int i=0;i<row;i++){
//            Arrays.sort(grid[i]);
//        }
        for(int j=0;j<col;j++){
            Arrays.sort(grid[j]);
        }
        for (int i=0;i<row;i++){
            for (int j=0;j<col;j++){
                System.out.print(grid[i][j]+" ");
            }
            System.out.println();
        }
    }
}
