package array;

public class array31 {
    public static void main(String[] args) {
        int[] num={1,2,3,4,5,6,7,8,9,10,11,12,14,15,16,17};
        int nsum=(17*(17+1))/2;
        int sum=0;
        for (int i=0;i< num.length;i++){
            sum+=num[i];
            }
        System.out.println(nsum-sum);
        }
    }