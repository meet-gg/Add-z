package Recursion;

public class large_ele {
    public static void main(String[] args) {
        int[] arr={1,20,41,23,74,9,14};
        int n=arr.length-1;
        System.out.println(large(arr,n,Integer.MIN_VALUE));
    }
    private static int large(int[] arr,int n,int le) {
        if (n==-1){
            return le;
        }
        if (le<arr[n]){
            le=arr[n];
        }
        return large(arr,n-1,le);
    }

}
