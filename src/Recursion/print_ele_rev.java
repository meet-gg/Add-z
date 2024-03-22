package Recursion;

public class print_ele_rev{
    public static void main(String[] args) {
        int[] arr={2,3,6,8,34,90};
        int n=arr.length-1;
        print(arr,n);
    }
    private static void print(int[] arr,int n){
        if (n==-1){
            return;
        }
        System.out.println(arr[n]);
        print(arr,n-1);
    }
}
