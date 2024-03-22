package array;

public class binary {
    public static void main(String[] args) {
        int[] num = {23, 34, 45, 56, 67, 34,78};
        int key = 78;
        int start = 0, end = num.length - 1;
        while (start <= end) {
            int mid =start+ (end-start) / 2;
            if (key == num[mid]) {
                System.out.println(mid);
                break;
            } else if (key > num[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        if (start>end){
            System.out.println("Key not found");
        }
    }
}