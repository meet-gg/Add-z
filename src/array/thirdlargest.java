package array;

public class thirdlargest{
    public static void main(String[] args) {
        int[] num = {2, 5, 6, 8, 9, 4, 3, 7, 7, 7, 3, 3, 9, 9};
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int max3 = Integer.MIN_VALUE;

        for (int i = 0; i < num.length; i++) {
            if (num[i] > max1) {
                max2 = max1;
                max1 = num[i];
            } else if (max2 < num[i] && num[i] != max1) {
                max3 = max2;
                max2 = num[i];
            }
              else  if (max3 < num[i] && num[i] != max2 && num[i] != max1) {
                    max3 = num[i];
                }
            }
        System.out.println(max3);
    }
}
