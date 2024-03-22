package Leetcode;

import java.util.Arrays;

public class leet1710 {
    public static void main(String[] args) {
        int[][] a=  {{5,10},{2,5},{4,7},{3,9}};
        for (int i=0;i<a.length;i++){
            for (int j=0;j<a[0].length;j++){
                Arrays.sort(a[j]);
            }
        }
        for (int i=0;i<a.length;i++){
            for (int j=0;j<a[0].length;j++){
                System.out.print(a[i][j]+" ");;
            }
            System.out.println();
        }
    }
}
