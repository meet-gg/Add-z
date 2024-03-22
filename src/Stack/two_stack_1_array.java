package Stack;

import java.util.Arrays;

public class two_stack_1_array {
    public static void main(String[] args) {
        int[] a=new int[10];
        int top1=-1;
        int top2=a.length;
        top1=push1(12,top2,top1,a);
        top1=push1(13,top2,top1,a);
        top1=push1(13,top2,top1,a);
        top1=push1(14,top2,top1,a);
//        top1=push1(14,top2,top1,a);
        top1=pop1(top1,a);
        top2=push2(17,top2,top1,a);
        top2=push2(18,top2,top1,a);
        top2=push2(19,top2,top1,a);
        top2=push2(15,top2,top1,a);
        top2=push2(132,top2,top1,a);
//        top2=pop2(top1,a);
//        top2=pop2(top1,a);
        top2=pop2(top2,a);
        top2=push2(15,top2,top1,a);
         top2=pop2(top2,a);
         top2=pop2(top2,a);
//        top2=push2(132,top2,top1,a);
//        top2=push2(132,top2,top1,a);
//        top2=pop2(top1,a);
//        top2=push2(133,top2,top1,a);
//        top2=push2(133,top2,top1,a);
        System.out.println(Arrays.toString(a));

    }
    private static int push1(int value,int top2,int top1 , int[] a){
        if ((top2-top1)>1){
            top1++;
            a[top1]=value;
            return top1;
        }
        else {
            System.out.println("overflow");
            return top1;
        }
    }
    private static int push2(int value,int top2,int top1 , int[] a){
        if ((top2-top1)>1){
            top2--;
            a[top2]=value;
            return top2;
        }
        else {
            System.out.println("overflow");
            return top2;
        }
    }
    private static int pop1(int top1 , int[] a) {
//        if (top1 >= 0) {
            top1--;
            return top1;
//        }
    }
        private static int pop2 ( int top2, int[] a){
//            if (top2 < a.length) {
//            int ans=a[top2];
                top2++;
                return top2;
//            }
        }
    }
