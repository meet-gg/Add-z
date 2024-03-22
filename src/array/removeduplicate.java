package array;

public class removeduplicate {
    public static void main(String[] args) {
        int[] num = {0, 0, 1, 1, 1, 1, 2, 2, 3, 4, 4, 5, 6, 6, 6, 7, 7, 7, 7, 7, 8, 8, 8, 8, 9, 9, 9, 10};
        for (int i = 0; i < num.length; i++) {
            int count = 0;
            for (int j = i + 1; j < num.length; j++) {
                if (num[i] == num[j]) {
                    count++;
                }
            }
            if (count == 0) {
                System.out.print(num[i] + " ");
            }
        }
    }
}