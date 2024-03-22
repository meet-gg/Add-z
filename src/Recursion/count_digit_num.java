package Recursion;

public class count_digit_num {
    public static void main(String[] args) {
        int n=100;
        System.out.println(count(n));
    }
    private static int count(int n) {
        if (n==0){
            return 0;
        }
        return 1 + count(n/10);
    }
}