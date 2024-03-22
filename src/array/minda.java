package array;

public class minda {
    public static void main(String[] args) {
       int n=342,count=0;
       int fact=1;
        for(int i=5;i<=n;i*=5) {
           count=count+(n/i);
        }
        System.out.println(count);
    }
}
