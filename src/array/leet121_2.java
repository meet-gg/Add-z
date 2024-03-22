package array;

public class leet121_2 {
    public static void main(String[] args) {
        int[] arr={3,1,4,8,7,2,5};
        int max=0;
        int minfar=arr[0];
        for(int i=0;i<arr.length;i++){
//            if(arr[i]<minfar){
//                minfar=arr[i];
//            } direct in buid vaoari shakay
            minfar=Math.min(minfar,arr[i]);
           int profit=arr[i]-minfar;
            max=Math.max(profit,max);
        }
        System.out.println(max);
    }
}
