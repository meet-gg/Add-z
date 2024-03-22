package array;

public class pascal {
    public static int factt(int n) {
        int fact=1;
        for (int i=1;i<n;i++){
            fact*=i;
        }
        return fact;
    }
    public static int fact(int n,int i) {
       int per=factt(n)/(factt(n-i)*factt(i));
       return per;
    }
    public static void main(String[] args) {
        int n=6;
        for(int i=0;i<n;i++){
            for (int j=0;j<i;j++){
                System.out.print(fact(n,i));
                System.out.println();
            }
        }
    }
}