package Recursion;

public class sum_1_n {
    public static void main(String[] args) {
        int n=5;
        System.out.println(sum(n));
    }
    private static int sum(int n){
        if(n==1){
            return 1;
        }
        return n+ sum(n-1);
    }
}
