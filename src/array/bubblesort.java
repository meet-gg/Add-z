package array;

import java.util.Arrays;

public class bubblesort {
    public static void main(String[] args) {
        int[] num={2,6,4,7,3,9,3};
        for(int i=0;i<num.length-1;i++){
            for (int j=0;j< num.length-1-i;j++){//aya num.length-1-i ni jagyaae num.lengh lakhavi to pn chale kem ke aagla sort hoy ne loop vadhare no chale aetle aapde -1-i karvi chavi
                if (num[j]>num[j+1]){
                    int temp=num[j];
                    num[j]=num[j+1];
                    num[j+1]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(num));
    }
}
