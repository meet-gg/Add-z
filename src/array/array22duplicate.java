package array;

public class array22duplicate {
    public static void main(String[] args) {
        int[] num={2,2,2,2,2,5,8,2,5,2,8,9,1,0};
        for (int i=0;i< num.length;i++){
            int a=0;
            for (int j=i+1;j< num.length;j++){
                if (num[i]==num[j]){
                    a++;
                }
            }
            if (a==1){
                System.out.println(num[i]);
            }
        }
    }
}