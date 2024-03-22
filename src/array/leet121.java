package array;

public class leet121 {
    public static void main(String[] args) {
        int[] arr={3,1,4,8,7,2,5};
        int[] ans=new int[arr.length];
        int max=0,max1=Integer.MIN_VALUE;
        int main_max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if (arr[i]<arr[j]){
                   max= arr[j]-arr[i];
                }
                max1=Math.max(max,max1);
            }
            ans[i]=max1;
            main_max=Math.max(ans[i],main_max);
        }
        System.out.println(main_max);
    }
}
