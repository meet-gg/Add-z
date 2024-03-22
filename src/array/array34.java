package array;

import java.util.Arrays;

public class array34 {
    public static void main(String[] args) {
        int[] n={2,4,7,8};
        int[] n2={3,5,6};
        int i=0,j=0,k=0;
        int[] n3=new int[n.length+ n2.length];
        while (i<n.length&&j<n2.length){
            if (n[i]<n2[j]){
                n3[k]=n[i];
                i++;
                k++;
            }
            else {
                n3[k]=n2[j];
                j++;
                k++;
            }
        }
        while (i<n.length){
            n3[k]=n[i];
            i++;
            k++;
        }
        while (j< n2.length){
            n3[k]=n2[j];
            k++;
            j++;
        }
        System.out.println(Arrays.toString(n3));
    }
}
