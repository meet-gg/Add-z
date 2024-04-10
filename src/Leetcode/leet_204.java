package Leetcode;

public class leet_204 {
    public static void main(String[] args) {
        System.out.println(countPrimes(499979));
    }
    public static int countPrimes(int n) {
        int count=0;
        for(int i=2;i<n;i++){
            if (i==2){
                count++;
                continue;
            }
            if(!prime(i)){
                count++;
            }
        }
        return count;
    }
    private static boolean prime(int n){
        for(int i=2;i<n;i++){
            if(n%i==0){
                return true;
            }
        }
        return false;
    }
}
