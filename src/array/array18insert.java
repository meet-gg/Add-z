package array;

import java.util.Arrays;
public class array18insert {
    public static void insert(int[] num,int pos,int element) {
        for (int i= num.length-1;i>pos;i--){
            num[i]=num[i-1];
        }
        num[pos]=element;
        System.out.println(Arrays.toString(num));
    }
    public static void print(int[] num) {
        for (int i=0;i<num.length-1;i++){
            System.out.print(num[i]+" ");
        }
    }
    public static void delete(int[] num,int dpos) {
            for (int i=0;i< num.length;i++){
                if (dpos==i){
                    for (int j=i;j< num.length-1;j++){
                        num[j]=num[j+1];
                    }
                }
            }
        print(num);
    }
    public static void update(int[] num,int upos,int uele) {
        for (int i= 0;i<num.length;i++){
           if (i==upos){
               num[i]=uele;
           }
        }
        print(num);
    }
    public static void main(String[] args) {
        int[] num={1,2,3,4,5,6,7};
        int pos=3;
        int element=40;
        int upos=3;
        int uele=10;
        int dpos=2;
        insert(num,pos,element);
    }
}