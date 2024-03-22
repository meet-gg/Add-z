package array;

public class stock {
    public static void main(String[] args) {
        int[] price={7,1,5,3,6,4};
       int buy=Integer.MAX_VALUE;
       int maxp=0;
       for(int i=0;i<price.length;i++) {
               if (buy<price[i]){
                   int profit=price[i]-buy;
                   maxp=Math.max(profit,maxp);
           }
               else {
                buy=price[i];
               }
       }
        System.out.println(maxp);
    }
}
