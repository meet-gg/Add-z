package Recursion;

public class reverse_int_num {
    public static void main(String[] args) {
        int n=521023578;
        System.out.println(reverse(n,0));
    }
    private static int reverse(int n,int rev){
        if (n==0){
            return rev;
        }
        rev=(rev *10 )+ n%10;
        return reverse(n/10,rev);
    }
}
