package Leetcode;

import java.util.Arrays;

public class leet1979 {
    public static void main(String[] args) {
        int[] n={2,3,4,5};
        Arrays.sort(n);
        int[] a=new int[n.length];
        int[] b=new int[n.length];
        a[0]=n[0];
        b[n.length-1]=n[n.length-1];
        int m=0;
        int c=Integer.MAX_VALUE;
        for (int i=0;i<n.length;i++) {
            m= Math.max(a[i],n[i]);
        }
        for (int i=0;i<n.length;i++){
            if (n[i]<c){
                c=n[i];
            }
        }
        if (m%c==0){
            System.out.println(c);
        }
        else if(c==m) {
            System.out.println(c);
        }
        else {
            System.out.println("1");
        }


//        System.out.println(m);
//        System.out.println(c);
    }
}
