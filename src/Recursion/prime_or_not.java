package Recursion;

public class prime_or_not {
    public static void main(String[] args) {
        int n=23;
        int p=n;
        System.out.println(prime(n,p));
    }
    private static boolean prime(int n,int p) {
        if (n==2){
            return false;
        }
        return prime(p/n-1,p);
    }
}
