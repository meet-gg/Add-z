package Leetcode;

public class leet1512 {
    public static void main(String[] args) {
        int[] arr={1,1,1,1};
        int count=0;
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr.length;j++) {
                if (arr[i] == arr[j] && i < j){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
