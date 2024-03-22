package Recursion;

public class sum_of_digit {
    public static void main(String[] args) {
        int n=1231112342;
        System.out.println(cal(n,0));
    }
    private static int cal(int n,int sum) {
        if (n==0){
            return sum;
        }
        sum=sum + n%10;
        return cal(n/10,sum);
    }
}
