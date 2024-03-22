package array;

import java.util.ArrayList;
public class spiral1 {
    public static void main(String[] args) {
      int[][]  matrix = {{1,2,3},{4,5,6},{7,8,9}};
            ArrayList<Integer> list = new ArrayList<>();
            int startROW = 0;
            int startCol = 0;
            int endROw = matrix.length - 1;
            int endCol = matrix[0].length - 1;
            while (startROW <= endROw && startCol <= endROw) {
                // top
                for (int j = startCol; j <= endCol; j++) {
                    list.add(matrix[startROW][j]);
                }
                if (startCol > endCol) {
                    break;
                }
                // right
                for (int i = startROW + 1; i <= endROw; i++) {
                    list.add(matrix[i][endCol]);
                }
                // bottom
                for (int j = endCol - 1; j >= startCol; j--) {
                    if (startROW == endROw) {
                        break;
                    }
                    list.add(matrix[endROw][j]);
                }

                // left
                for (int i = endROw - 1; i >= startROW + 1; i--) {
                    if (startCol == endCol) {
                        break;
                    }
                    list.add(matrix[i][startCol]);
                }
                startROW++;
                startCol++;
                endROw--;
                endCol--;
            }
        System.out.println(list);
        }
    }