package array;

public class leet1431 {
    public static void main(String[] args) {
       int[] candies = {2,3,5,1,3};
       int  extraCandies = 3;
       int[] count=new int[candies.length];
       for (int i=0;i<candies.length;i++){
           if (candies[i]+extraCandies>i+1){
               System.out.print("true"+" ");
           }
           else {
               System.out.print("false"+" ");
           }
       }
    }
}
