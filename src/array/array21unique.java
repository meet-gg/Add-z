package array;

public class array21unique {
    public static void main(String[] args) {

        int[] num={2,5,6,8,22,3,3,5,2,6,2,8,5,9,8};
        for (int i=0;i< num.length;i++){
            int a=0;
            for (int j=0;j< num.length;j++){
                if (i==j){
                    continue;
                }
                if (num[i]==num[j]){
                }
            }
            if (a==0){
                System.out.println(num[i]);
            }
        }
    }
}