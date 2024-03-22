package array;

public class mstsorted {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}};
        int key = 16;
        for (int i = 0; i < arr.length; i++) {
            int a = arr[i].length;
            int start = 0;
            int end = a - 1;
            while (start <= end) {
                int mid = (start + end) / 2;
                if (key == arr[i][mid]) {
                    System.out.println("present");
                    return;
                } else if (key > arr[i][mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        System.out.println("not present");
    }
}
